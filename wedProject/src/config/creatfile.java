package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class creatfile {

	public static void main(String[] args) throws Exception {
		
		
		File filepath = new File("C:\\Users\\Abdel\\Documents\\wed_Class\\wedProject\\src\\config\\Abbi.properties");
		FileInputStream  file = new FileInputStream(filepath);
		Properties ppt = new Properties();
	
		ppt.load(file);
		
		String user, pass, byId;
		
		user = ppt.getProperty("username");
		pass = ppt.getProperty("password");
		byId = ppt.getProperty("byId");
		
		
		System.out.println("username is : " + user + " " + " password is : " + pass);
		
	}
	
	

}
