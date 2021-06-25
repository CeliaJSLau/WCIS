package org.tempuri.WSLCSD.Service;


import java.math.BigInteger;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;
public class Test {
	private Gson gson = new Gson(); 
	public static Util util = new Util();
	protected final Log logger = LogFactory.getLog(getClass());
	private static final String  hexKey="587c6e23a0a5938252b1805d57783709";	

	public static void main(String[] args)  throws Exception{
		Date date = new SimpleDateFormat("d/M/yyyy hh:mm:ss a",Locale.US).parse("6/1/2021 3:09:12 PM");
		System.out.println(new SimpleDateFormat("yyyymmddhhmmss").format(date)				
				);
		System.out.println(LocalDate.now().isBefore(LocalDate.now().minusDays(1))			
				);
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()-24*60*60*1000))); // Tue Dec 31 23:59:59 CST 2019
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Timestamp(System.currentTimeMillis())));
//		 Optional<Integer> b = Optional.of(null);
//		System.out.println(new Date());
//		test1mainSoap();	

//		encryptStream(new FileInputStream("D:\\Celia - support\\vps2\\test xml\\c.xml"),
//				new FileOutputStream("D:\\Celia - support\\vps2\\test xml\\c1.xml"));  
		
//		 System.out.println(encodeFileToBase64( new File("D:\\Celia - support\\vps2\\test file\\ctrl.txt")));
//		String dir= util.getPath("WCIS_EXPORT_DIR");
//		Files.move
//        (Paths.get(dir + "update_status_by_vps.txt"), 
//        Paths.get(util.getPath("WCIS_IMPORT_DIR") + "update_status_by_vps.txt"));
//		Connection conn=new DBUtil().getConnection();
//		new ParseLCSDDB().extractCodeTableFromDB(conn);
//		conn.close();
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
//			System.out.println(gson.toJson(detailList));
//			final StringBuilder ref_nos = new StringBuilder();
//			detailList.forEach(LCSDCaseDetailList->{
//				ref_nos.append("'"+LCSDCaseDetailList.getReferralNo()+"'"+",");
//			});
//			System.out.println(ref_nos.substring(0, ref_nos.length() - 1));
			if(detailList!=null && !detailList.isEmpty()) {
//				parse.parseCase(detailList,conn);
			}
			
	
		}catch(Exception e) {
			logger.error("importCase: ", e);
			throw new Exception("[importCase => " + e.toString() + "]");
		}		
	}

}
