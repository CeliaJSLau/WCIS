package org.tempuri.WSLCSD.Service;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

public class WCISDBIO {
	
	private Gson gson = new Gson(); 
	protected final Log logger = LogFactory.getLog(getClass());	
	public Util util = new Util();
	public ParseLCSDDB parse = new ParseLCSDDB();
	
	public static void main(String[] args)  throws Exception{
		
		
//		String processDate = (args.length>0 && args[0]!=null)?args[0]:(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()-24*60*60*1000)));
//		new WCISDBIO().wcis_ws2db("2021-06-25");
		
		WCISDBIO newJob =new WCISDBIO();
		
		if(args.length>0 && args[0]!=null)
			newJob.wcis_ws2db(args[0]);
		else {
			for(String s : newJob.getProcessDate()) {
				newJob.wcis_ws2db(s);
			}
		}
			

	}
	public void wcis_ws2db(String getDate) throws Exception {
		
		logger.info("Run WCISDBIO for request Date: "+getDate);
		Connection conn=getDBConnection();
		try {
			org.tempuri.WSLCSD.Service.MainSoapStub binding= getSoap();
			String loginToken=getLogin(getDate,binding);
			doDataTransmission(binding,loginToken,getDate,conn);
			updateJobandSendEmail(true,conn,getDate);
		}catch(Exception e) {
			updateJobandSendEmail(false,conn,getDate);
		}
		conn.close();
	}
	
	
	public void doDataTransmission(org.tempuri.WSLCSD.Service.MainSoapStub binding, String loginToken, String requestDate,Connection conn) throws Exception{
		

		importSubjectMatter(binding,loginToken,requestDate,conn);

		importCaseStatus(binding,loginToken,requestDate,conn);

		importCaseType(binding,loginToken,requestDate,conn);

		importReferralStatus(binding,loginToken,requestDate,conn);

		importCase(binding,loginToken,requestDate,conn);
		
		exportCodeTable(binding,loginToken,requestDate,conn);
		
	}
	
	
	public org.tempuri.WSLCSD.Service.MainSoapStub getSoap() {
		
		org.tempuri.WSLCSD.Service.MainSoapStub binding;
		try {
			binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
					new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
		}
		catch (javax.xml.rpc.ServiceException jre) {
			
			logger.error("JAX-RPC ServiceException caught: ", jre);
			throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);

		}
		
		binding.setTimeout(60000);
		
		return binding;
	}
				
	public String getLogin(String getDate,org.tempuri.WSLCSD.Service.MainSoapStub binding) throws Exception{
		
		org.tempuri.WSLCSD.Service.LoginRsp value = null;
		try {
			value = binding.login(new org.tempuri.WSLCSD.Service.LoginReq(util.getPath("WSLOGIN"),util.getPath("WSPWD")));
		}catch(Exception e) {
			logger.error("login error: ", e);
			throw new Exception("[getLogin => " + e.toString() + "]");
		}

		org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists=value.getReturnStatusLists();
		int loginStatus = returnStatusLists[0].getReturnCode();
		logger.info("login status: "+returnStatusLists[0].getReturnCode() +" "+returnStatusLists[0].getReturnMsg());
		if(loginStatus!=100) {
			logger.info("LOGIN WCIS WS FAILED ON "+getDate);
			throw new Exception("login failed");
		}	
		
		return value.getReturnStatusLists()[0].getReturnKey();
		
	}

	public Connection getDBConnection() {
		
		Connection conn=new DBUtil().getConnection();
		return conn;
	}
	
	public List<String> getProcessDate() throws SQLException{
		
		LocalDate latestProcessDate = LocalDate.parse(parse.getLatestProcessDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate currentProcessDate = LocalDate.now().minusDays(1);		

		List<String> processDates = new ArrayList<String>();

		do {
			processDates.add(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(currentProcessDate));
			currentProcessDate = currentProcessDate.minusDays(1);

		}while(latestProcessDate.isBefore(currentProcessDate));
		
		Collections.reverse(processDates);
		
		return processDates;
	}
		
	public void importSubjectMatter(org.tempuri.WSLCSD.Service.MainSoapStub binding, String loginToken, String requestDate,Connection conn) throws Exception{
		org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp value1 = null;
		try {
		
			value1 = binding.getLCSDSubjectMatterList(new org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq(loginToken,requestDate,""));
			
			logger.info("LCSDSubjectMatterLists returnstatus:"+value1.getReturnStatusLists()[0].getReturnCode()+" - "+value1.getReturnStatusLists()[0].getReturnMsg());
			
			if(value1.getReturnStatusLists()[0].getReturnCode()==101) {
				parse.parseSubjectMatter(value1.getLCSDSubjectMatterLists(),conn);
			}			
	
		}catch(Exception e) {
			logger.error("importSubjectMatter: ", e);
			throw new Exception("[importSubjectMatter => " + e.toString() + "]");
		}		
	}
	
	public void importCaseStatus(org.tempuri.WSLCSD.Service.MainSoapStub binding, String loginToken, String requestDate,Connection conn)  throws Exception{
		org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value2 = null;
		try {
		
			value2 = binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(loginToken,requestDate,"CASE_STATUS",""));
			
			logger.info("LCSDCaseStatusCodes returnstatus:"+value2.getReturnStatusLists()[0].getReturnCode()+" - "+value2.getReturnStatusLists()[0].getReturnMsg());

			System.out.println(gson.toJson(value2.getLCSDMappingLists()));
			if(value2.getReturnStatusLists()[0].getReturnCode()==101) {
				parse.parseCaseStatus(value2.getLCSDMappingLists(),conn);
			}			
	
		}catch(Exception e) {
			logger.error("importCaseStatus: ", e);
			throw new Exception("[importCaseStatus => " + e.toString() + "]");
		}		
	}
	
	public void importCaseType(org.tempuri.WSLCSD.Service.MainSoapStub binding, String loginToken, String requestDate,Connection conn) throws Exception{
		org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value3 = null;
		try {
		
			value3 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(loginToken,requestDate,"CASE_TYPE",""));
			
			logger.info("LCSDCaseTypeCodes returnstatus:"+value3.getReturnStatusLists()[0].getReturnCode()+" - "+value3.getReturnStatusLists()[0].getReturnMsg());

			System.out.println(gson.toJson(value3.getLCSDMappingLists()));
			if(value3.getReturnStatusLists()[0].getReturnCode()==101) {
				parse.parseCaseType(value3.getLCSDMappingLists(),conn);
			}			
	
		}catch(Exception e) {
			logger.error("importCaseType: ", e);
			throw new Exception("[importCaseType => " + e.toString() + "]");
		}		
	}	
	
	public void importReferralStatus(org.tempuri.WSLCSD.Service.MainSoapStub binding, String loginToken, String requestDate,Connection conn) throws Exception {
		org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value4 = null;
		try {
		
			value4 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(loginToken,requestDate,"REFERRAL_STATUS",""));
			
			logger.info("ReferralStatusCodes returnstatus:"+value4.getReturnStatusLists()[0].getReturnCode()+" - "+value4.getReturnStatusLists()[0].getReturnMsg());

			System.out.println(gson.toJson(value4.getLCSDMappingLists()));
			if(value4.getReturnStatusLists()[0].getReturnCode()==101) {
				parse.parseReferralStatus(value4.getLCSDMappingLists(),conn);
			}			
	
		}catch(Exception e) {
			logger.error("importReferralStatus: ", e);
			throw new Exception("[importReferralStatus => " + e.toString() + "]");
		}		
	}
	
	public void importCase(org.tempuri.WSLCSD.Service.MainSoapStub binding, String loginToken, String requestDate,Connection conn)  throws Exception{
		
		org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp value5=null;
		String datasetKey="";
		List<LCSDCaseDetailList> detailList = new ArrayList<LCSDCaseDetailList>();
		try {

			do {

				value5 = binding.getLCSDCaseDetailList(new org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq(loginToken,requestDate,datasetKey));
				datasetKey = value5.getReturnStatusLists()[0].getReturnKey();
				Collections.addAll(detailList, value5.getLCSDCaseDetailLists());   
				logger.info("LCSDCaseDetailLists returnstatus:"+value5.getReturnStatusLists()[0].getReturnCode()+" - "+value5.getReturnStatusLists()[0].getReturnMsg());
			}while(value5.getReturnStatusLists()[0].getReturnCode()==102);
			if(detailList!=null && !detailList.isEmpty()) {
				parse.parseCase(detailList,conn);
			}
			
	
		}catch(Exception e) {
			logger.error("importCase: ", e);
			throw new Exception("[importCase => " + e.toString() + "]");
		}		
	}
	
	public void exportCodeTable(org.tempuri.WSLCSD.Service.MainSoapStub binding, String loginToken, String requestDate,Connection conn)  throws Exception{
		
		try {
			
			String[] CODE_TABLE = util.getPath("CODE_TABLES").split(",");
			String exportDir = util.getPath("WCIS_EXPORT_DIR");
			parse.extractCodeTableFromDB(conn);
			
			
			org.tempuri.WSLCSD.Service.UploadLCSDFileRsp value6 =binding.uploadLCSDFile(new org.tempuri.WSLCSD.Service.UploadLCSDFileReq(loginToken,requestDate,"ctrl.txt",util.encodeFileToBase64(new File(exportDir+"ctrl.txt"))));
			logger.info("uploadLCSDFile "+"ctrl.txt"+" returnstatus:"+value6.getReturnStatusLists()[0].getReturnCode()+" - "+value6.getReturnStatusLists()[0].getReturnMsg());
			
			for (int i = 0; i < CODE_TABLE.length; i++) {
				File executeFile = new File(exportDir+CODE_TABLE[i]+".CSV");
				if(executeFile.exists()) {		
					value6=binding.uploadLCSDFile(new org.tempuri.WSLCSD.Service.UploadLCSDFileReq(loginToken,requestDate,CODE_TABLE[i]+".CSV",util.encodeFileToBase64(executeFile)));
					logger.info("uploadLCSDFile "+CODE_TABLE[i]+".CSV"+" returnstatus:"+value6.getReturnStatusLists()[0].getReturnCode()+" - "+value6.getReturnStatusLists()[0].getReturnMsg());
				}else
					logger.info("uploadLCSDFile not exists:"+CODE_TABLE[i]+".CSV");
			}

			
		}catch(Exception e) {
			logger.error("exportCodeTable: ", e);
			throw new Exception("[exportCodeTable => " + e.toString() + "]");
		}
		
		
	}
	
	public void updateJobandSendEmail(boolean success,Connection conn, String processDate) throws Exception {

		String success_text=success?"Success":"Failed";

		long BATCH_HISTORY_SEQ=parse.getBatchHistSeq(success?"Completed":"Failed",conn);
		
		if(success)
			parse.updateWCISSyncDate(conn,processDate);
		
		String subject = "WCISDataIO completed with status " + success_text + " (Batch History Sequence: "
				+ BATCH_HISTORY_SEQ + ")";
		String message = "Dear Administrator,<br><br>Please be informed that the job WCISDataIO" 
				+ " was completed with status " + success_text + " at "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " with batch history sequence: "
				+ BATCH_HISTORY_SEQ + ".";
		
		List<String> USER_ID=parse.getSysUserId(conn);

		USER_ID.forEach((String name) -> {		util.message(name, subject, message);      });

		logger.info("WCISDataIO completed with status "+success_text+" on " +new Date());
	}
}
