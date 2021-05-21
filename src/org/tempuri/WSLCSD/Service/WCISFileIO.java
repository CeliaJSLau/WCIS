package org.tempuri.WSLCSD.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;
import java.util.Calendar;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class WCISFileIO {
	
	private Gson gson = new Gson(); 
	protected final Log logger = LogFactory.getLog(getClass());
	private static final String hexKey="587c6e23a0a5938252b1805d57783709";		
	
	public static void main(String[] args)  throws Exception{
		System.out.println(args[0]);

		WCISFileIO io=new WCISFileIO();
		io.callWCISWS(args[0]);
		
	}
	public void callWCISWS(String getDate) throws Exception {
		org.tempuri.WSLCSD.Service.MainSoapStub binding;
		try {
			binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
					new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
		}
		catch (javax.xml.rpc.ServiceException jre) {
			if(jre.getLinkedCause()!=null)
				jre.getLinkedCause().printStackTrace();

			logger.error("JAX-RPC ServiceException caught: ", jre);
			throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);

		}

		binding.setTimeout(60000);
		org.tempuri.WSLCSD.Service.LoginRsp value = null;
		try {
			value = binding.login(new org.tempuri.WSLCSD.Service.LoginReq(getPath("WSLOGIN"),getPath("WSPWD")));
		}catch(Exception e) {
			logger.error("login error: ", e);
			return;
		}

		org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists=value.getReturnStatusLists();
		int loginStatus = returnStatusLists[0].getReturnCode();
		logger.info("login status: "+returnStatusLists[0].getReturnCode() +" "+returnStatusLists[0].getReturnMsg());
		if(loginStatus!=100) {
			logger.info("LOGIN WCIS WS FAILED ON "+getDate);
			return;
		}		

		String requestDate = getDate;
		String token = returnStatusLists[0].getReturnKey();
		String datasetKey = "";

		logger.info("get binding token: "+token);
		logger.info("Start getting WCIS data on "+requestDate);

		File importDir = new File(getPath("WCIS_IMPORT_DIR")+requestDate);

		if (importDir.exists() == false) {
			importDir.mkdir();
			System.out.println("importDir " + importDir.toString() + " created.");
		} else {
			System.out.println("importDir " + importDir.toString() + " is existed.");
		}

		try {

			org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp value1 = binding.getLCSDSubjectMatterList(new org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq(token,requestDate,datasetKey));
			XMLUtil.convertToXml(list2lists(array2List(value1.getLCSDSubjectMatterLists()),"LCSDSubjectMatterLists","org.tempuri.WSLCSD.Service"), importDir+"/sm.xml");
			logger.info("LCSDSubjectMatterLists returnstatus:"+value1.getReturnStatusLists()[0].getReturnCode()+" - "+value1.getReturnStatusLists()[0].getReturnMsg());

			org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value2 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(token,requestDate,"CASE_STATUS",datasetKey));
			XMLUtil.convertToXml(list2lists(array2List(value2.getLCSDMappingLists()),"CaseStatusCodes","org.tempuri.WSLCSD.Service"), importDir+"/cs.xml");
			logger.info("LCSDCaseStatusCodes returnstatus:"+value2.getReturnStatusLists()[0].getReturnCode()+" - "+value2.getReturnStatusLists()[0].getReturnMsg());

			org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value3 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(token,requestDate,"CASE_TYPE",datasetKey));
			XMLUtil.convertToXml(list2lists(array2List(value3.getLCSDMappingLists()),"CaseTypeCodes","org.tempuri.WSLCSD.Service"),  importDir+"/ct.xml");
			logger.info("LCSDCaseTypeCodes returnstatus:"+value3.getReturnStatusLists()[0].getReturnCode()+" - "+value3.getReturnStatusLists()[0].getReturnMsg());

			org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value4 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(token,requestDate,"REFERRAL_STATUS",datasetKey));
			XMLUtil.convertToXml(list2lists(array2List(value4.getLCSDMappingLists()),"ReferralStatusCodes","org.tempuri.WSLCSD.Service"),  importDir+"/rs.xml");
			logger.info("ReferralStatusCodes returnstatus:"+value4.getReturnStatusLists()[0].getReturnCode()+" - "+value4.getReturnStatusLists()[0].getReturnMsg());

			org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp value5=null;
			List<LCSDCaseDetailList> detailList = new ArrayList<LCSDCaseDetailList>();

			do {

				value5 = binding.getLCSDCaseDetailList(new org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq(token,requestDate,datasetKey));
				datasetKey = value5.getReturnStatusLists()[0].getReturnKey();
				Collections.addAll(detailList, value5.getLCSDCaseDetailLists());   
				logger.info("LCSDCaseDetailLists returnstatus:"+value5.getReturnStatusLists()[0].getReturnCode()+" - "+value5.getReturnStatusLists()[0].getReturnMsg());
			}while(value5.getReturnStatusLists()[0].getReturnCode()==102);

			XMLUtil.convertToXml(list2lists(detailList,"LCSDCaseDetailLists","org.tempuri.WSLCSD.Service"), importDir+"/c1.xml");        
			encryptStream(new FileInputStream(importDir+"/c1.xml"),	new FileOutputStream(importDir+"/c.xml"));	
			
			String[] CODE_TABLE = getPath("CODE_TABLES").split(",");
			String exportDir = getPath("WCIS_EXPORT_DIR");
			org.tempuri.WSLCSD.Service.UploadLCSDFileRsp value6 =null;
			for (int i = 0; i < CODE_TABLE.length; i++) {
				File executeFile = new File(exportDir+"/"+CODE_TABLE[i]+".CSV");
				if(executeFile.exists()) {		
					value6=binding.uploadLCSDFile(new org.tempuri.WSLCSD.Service.UploadLCSDFileReq(token,requestDate,CODE_TABLE[i]+".CSV",encodeFileToBase64(executeFile)));
					logger.info("uploadLCSDFile "+CODE_TABLE[i]+".CSV"+" returnstatus:"+value6.getReturnStatusLists()[0].getReturnCode()+" - "+value6.getReturnStatusLists()[0].getReturnMsg());
				}else
					logger.info("uploadLCSDFile not exists:"+CODE_TABLE[i]+".CSV");
			}
		}catch(Exception e) {
			logger.error(e);
		}
	}


	private  byte[] fromHex(String buffer) {
		return (new BigInteger(buffer, 16)).toByteArray();
	}	

	public String getPath(String propPath){
		InputStream inputStream;
		try {	

			Properties prop = new Properties();
			inputStream = WCISFileIO.class.getClassLoader().getResourceAsStream("config.properties");
			prop.load(inputStream);
			logger.info(prop.getProperty(propPath));
			if(prop.getProperty(propPath)==null){
				logger.info("Failed to load the properties files at args[0]");
			}else
				return prop.getProperty(propPath);

		}catch(Exception e) {
			logger.error(	e);
		}
		return "";
	}

	public  String encodeFileToBase64(File file) {
		try {
			byte[] fileContent = Files.readAllBytes(file.toPath());
			return Base64.getEncoder().encodeToString(fileContent);
		} catch (IOException e) {
			logger.error("could not read file ",e);
			throw new IllegalStateException("could not read file " + file, e);
		}
	}	

	public  void encryptStream(InputStream in, OutputStream out) throws Exception {		  

		try {
			SecretKeySpec keySpec = new SecretKeySpec(fromHex(hexKey), "AES");
			// 生成Cipher对象
			Cipher  cipher = Cipher.getInstance("AES");
			// 用密钥加密明文(plainText),生成密文(cipherText)
			cipher.init(Cipher.ENCRYPT_MODE, keySpec); // 操作模式为加密(Cipher.ENCRYPT_MODE),key为密钥
			byte buffer[] = new byte[4096];
			for (int read = in.read(buffer); read > 0; read = in.read(buffer)) {
				byte encrypted[] = cipher.update(buffer, 0, read);
				out.write(encrypted);
			}
			out.write(cipher.doFinal());
			out.flush();

			in.close();
			out.close();
		} catch (Exception e) {
			logger.error("[encryptStream => " + e.toString() + "]");
			throw new Exception("[encryptStream => " + e.toString() + "]");
		}
	}

	public  <T> List<T> array2List(T[]  arrList) {

		List<T> List = new ArrayList<T>();
		Collections.addAll(List, arrList);   

		return List;	
	}

	public  <T,E> E list2lists(List<T> list, String className, String folderName) throws Exception{
		Class c = Class.forName(folderName+"."+className);

		E lists = (E)c.newInstance();

		c.getDeclaredMethod("set"+className,  List.class ).invoke(lists, list);	

		return lists;	
	}



}
