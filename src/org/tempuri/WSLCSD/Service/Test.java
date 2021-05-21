package org.tempuri.WSLCSD.Service;


import com.google.gson.Gson;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Collections;
import java.io.File;
import java.lang.String;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.nio.file.Files;
import java.util.Hashtable;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.math.BigInteger;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.io.InputStream;
import java.io.OutputStream;
public class Test {
	private Gson gson = new Gson(); 
	protected final Log logger = LogFactory.getLog(getClass());
	private static final String  hexKey="587c6e23a0a5938252b1805d57783709";	
	private static byte[] fromHex(String buffer) {
		return (new BigInteger(buffer, 16)).toByteArray();
	}
	public static void main(String[] args)  throws Exception{

		test1mainSoap();	

//		encryptStream(new FileInputStream("D:\\Celia - support\\vps2\\test xml\\c.xml"),
//				new FileOutputStream("D:\\Celia - support\\vps2\\test xml\\c1.xml"));  
		
//		 System.out.println(encodeFileToBase64( new File("D:\\Celia - support\\vps2\\test file\\ctrl.txt")));
	}
	
	
	private static String encodeFileToBase64(File file) {
	    try {
	        byte[] fileContent = Files.readAllBytes(file.toPath());
	        return Base64.getEncoder().encodeToString(fileContent);
	    } catch (IOException e) {
	        throw new IllegalStateException("could not read file " + file, e);
	    }
	}
	

	
	   public static void encryptStream(InputStream in, OutputStream out) throws Exception {		  

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
				throw new Exception("[encryptStream => " + e.toString() + "]");
			}
	    }
	   
	
    public static void test1mainSoap() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoapStub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        //assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.LoginRsp value = binding.login(new org.tempuri.WSLCSD.Service.LoginReq("LCSD_WS","12345Abc"));
        org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists=value.getReturnStatusLists();
        
        System.out.println(returnStatusLists[0].getReturnCode()+" "+returnStatusLists[0].getReturnMsg()+" "+returnStatusLists[0].getReturnKey()+" Celia: "+value.getToken());
        
        
        // Time out after a minute
        String token= returnStatusLists[0].getReturnKey();
        String requestDate = "2021-04-10";
        
        String datasetKey = "";

        binding.setTimeout(60000);
        System.out.println(token);
        
        org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp value1 = binding.getLCSDSubjectMatterList(new org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq(token,requestDate,datasetKey));
//        System.out.println(new  Gson().toJson(value1.getReturnStatusLists()));
//        System.out.println(new  Gson().toJson(value1.getLCSDSubjectMatterLists()));
        XMLUtil.convertToXml(list2lists(array2List(value1.getLCSDSubjectMatterLists()),"LCSDSubjectMatterLists","org.tempuri.WSLCSD.Service"), "D:\\Celia - support\\vps2\\test xml\\sm.xml");
        // Test operation
        org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value2 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(token,requestDate,"CASE_STATUS",datasetKey));
        // TBD - validate results
//        System.out.println(new  Gson().toJson(value2.getReturnStatusLists()));
//        System.out.println(new  Gson().toJson(value2.getLCSDMappingLists()));
        XMLUtil.convertToXml(list2lists(array2List(value2.getLCSDMappingLists()),"CaseStatusCodes","org.tempuri.WSLCSD.Service"), "D:\\Celia - support\\vps2\\test xml\\cs.xml");
        org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value3 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(token,requestDate,"CASE_TYPE",datasetKey));
        // TBD - validate results
//        System.out.println(new  Gson().toJson(value3.getReturnStatusLists()));
//        System.out.println(new  Gson().toJson(value3.getLCSDMappingLists()));
        XMLUtil.convertToXml(list2lists(array2List(value3.getLCSDMappingLists()),"CaseTypeCodes","org.tempuri.WSLCSD.Service"), "D:\\Celia - support\\vps2\\test xml\\ct.xml");
        org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value4 =binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq(token,requestDate,"REFERRAL_STATUS",datasetKey));
        // TBD - validate results
//        System.out.println(new  Gson().toJson(value4.getReturnStatusLists()));
//        System.out.println(new  Gson().toJson(value4.getLCSDMappingLists()));
        XMLUtil.convertToXml(list2lists(array2List(value4.getLCSDMappingLists()),"ReferralStatusCodes","org.tempuri.WSLCSD.Service"), "D:\\Celia - support\\vps2\\test xml\\rs.xml");
        
        System.out.println("Detail ");
        
        
        
        org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp value5=null;
        List<LCSDCaseDetailList> detailList = new ArrayList<LCSDCaseDetailList>();

        String codeMsg="";
        do {
        	
        value5 = binding.getLCSDCaseDetailList(new org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq(token,requestDate,datasetKey));
        // TBD - validate results
//        System.out.println(new  Gson().toJson(value5.getReturnStatusLists()));
//        System.out.println(new  Gson().toJson(value5.getLCSDCaseDetailLists()));
       
        datasetKey = value5.getReturnStatusLists()[0].getReturnKey();
        codeMsg = value5.getReturnStatusLists()[0].getReturnMsg();
        Collections.addAll(detailList, value5.getLCSDCaseDetailLists());   
        
        
//        detailList.addAll(value5.getLCSDCaseDetailLists());
        
        }while(value5.getReturnStatusLists()[0].getReturnCode()==102);
//        System.out.println(codeMsg);
//        System.out.println(new  Gson().toJson(detailList));
        XMLUtil.convertToXml(list2lists(detailList,"LCSDCaseDetailLists","org.tempuri.WSLCSD.Service"), "D:\\Celia - support\\vps2\\test xml\\c.xml");
        // TBD - validate results
//    	File directory = new File("D:\\Celia - support\\vps2\\test xml\\"+"test.xml");
        
        
        //4.REFERRAL_STATUS
        
//        List<LCSDMappingList> mappingList = new ArrayList<LCSDMappingList>();
//        Collections.addAll(mappingList, value4.getLCSDMappingLists());   
//        
//        LCSDMappingLists mappingLists = new LCSDMappingLists();
//        mappingLists.setLCSDMappingLists(mappingList);        
//        
//        System.out.println("celia : "+new  Gson().toJson(mappingLists));
//        String str = XMLUtil.convertToXml(mappingLists);

//        System.out.println(str);
       // String str = XMLUtil.convertToXml(detailList);        
//        XMLUtil.convertToXml(mappingLists, "D:\\Celia - support\\vps2\\test xml\\rs.xml");
//        
//        List<LCSDMappingList> mappingList1= array2List(value4.getLCSDMappingLists());
//        LCSDMappingLists mappingLists1= list2lists(mappingList1,"LCSDMappingLists","org.tempuri.WSLCSD.Service.");
//        System.out.println("celia 1 : "+new  Gson().toJson(mappingLists1));

        //1.SubjectMatter
       
//        List<LCSDSubjectMatterList> smList = new ArrayList<LCSDSubjectMatterList>();
//        Collections.addAll(smList, value1.getLCSDSubjectMatterLists());   
//        
//        LCSDSubjectMatterLists smLists = new LCSDSubjectMatterLists();
//        smLists.setLCSDSubjectMatterLists(smList);   
        
        //
        org.tempuri.WSLCSD.Service.UploadLCSDFileRsp value6 = binding.uploadLCSDFile(new org.tempuri.WSLCSD.Service.UploadLCSDFileReq(token,requestDate,"CATEGORY.CSV",encodeFileToBase64( new File("D:\\Celia - support\\vps2\\test file\\CATEGORY.CSV"))));
        System.out.println(value6.getReturnStatusLists()[0].getReturnCode());
    }
    
    
    public static <T> List<T> array2List(T[]  arrList) {
	
        List<T> List = new ArrayList<T>();
        Collections.addAll(List, arrList);   
        
        return List;	
    }
    
    public static <T,E> E list2lists(List<T> list, String className, String folderName) throws Exception{
    	Class c = Class.forName(folderName+"."+className);

    	E lists = (E)c.newInstance();
    		
    	c.getDeclaredMethod("set"+className,  List.class ).invoke(lists, list);	
        
        return lists;	
    }

}
