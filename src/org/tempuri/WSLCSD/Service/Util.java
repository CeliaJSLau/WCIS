package org.tempuri.WSLCSD.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Util {
	protected final Log logger = LogFactory.getLog(getClass());
	private  byte[] fromHex(String buffer) {
		return (new BigInteger(buffer, 16)).toByteArray();
	}	

	public String getPath(String propPath){
		InputStream inputStream;
		try {	

			Properties prop = new Properties();
			inputStream = Util.class.getClassLoader().getResourceAsStream("config.properties");
			prop.load(inputStream);
			System.out.println(prop.getProperty(propPath));
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

	public boolean message(String to, String subject, String content) {
		String EMAIL_POSTFIX = getPath("EMAIL_POSTFIX");

		System.out.println(new Date() + " Sending Email to " + to + EMAIL_POSTFIX);

		// Sender's email ID needs to be mentioned
		String from = getPath("EMAIL_FROM");
		String host = getPath("SMTP_HOST");
		System.setProperty("java.net.preferIPv4Stack" , "true") ;
		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties);

		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: header field
			message.setSubject(subject);

			message.setContent(content, "text/html;charset=utf-8");
			// Send message
		
			Transport.send(message);
			System.out.println(new Date() + " Email sent");
			return true;
		} catch (Exception e) {
			System.err.println(new Date() + " Unable to send email");
			System.err.println(e.toString());
			return false;
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

	
	public String checkNull(String item){
		if(item!=null && item.length()==0)
			return null;
		return item;
	}
	
	public Date dateParser(String str){
		Date date=null;
		try {
			if(str!=null && str.length()!=0)
				date=new SimpleDateFormat("M/d/yyyy hh:mm:ss a",Locale.US).parse(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return date;
	}	
		
	public int writeFile(File file, ResultSet rs)  throws Exception {
		
		PrintWriter writer = new PrintWriter(file, "Big5");
		int count=-1;
		if(rs != null) {
			while (rs.next()) {
				for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {
					if (rs.getString(j) != null) {
						writer.print(rs.getString(j) + "~|~");
					} else {
						writer.print("~|~");
					}
				}
				writer.println();
				count++;
			}
			writer.close();
		}
		return count;
		
	}
	
	public void writeFile(File file, String content)  throws Exception {
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(content);
		bw.flush();

		fw.close();
		bw.close();

	}
}
