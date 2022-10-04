package nopwebsitetesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readpropfile {

	static Properties prop;

	public readpropfile() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\SURAJ\\Backup_29122021\\Work\\Traning\\seleniumsep\\workspace\\com.sopramaven\\src\\main\\resources\\configuration.properties");
		prop = new Properties();
		prop.load(fis);
	}

	public String getApplicationURL_QA() {
		String appURL = prop.getProperty("mainurl");
		return appURL;
	}

	public String getUserName() {
		return prop.getProperty("email");
	}

	public String getPass() {
		return prop.getProperty("password");
	}

	public String getloginpagetitle() {
		return prop.getProperty("loginpagetitle");
	}
	
	public String gethomepagetitle() {		
		return prop.getProperty("homepagetitle");
	}
	
	// methods to input data on customer search screen
	public String inputemailoncustomersearch() {		
		return prop.getProperty("customersearchemailid");
	} 
	
	public String firstnameintable() {
		
		return prop.getProperty("firstname");
	}
}
