package nopwebsitetesting;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class readxpathfile {

	static Properties xpathprop;

	public readxpathfile() throws IOException {

		FileInputStream fiss = new FileInputStream(
				"C:\\SURAJ\\Backup_29122021\\Work\\Traning\\seleniumsep\\workspace\\com.sopramaven\\src\\main\\resources\\xpath.properties");
		xpathprop = new Properties();
		xpathprop.load(fiss);

	}

	public String usernamexpath() {
		return xpathprop.getProperty("username");
	}

	public String passwordxpath() {
		return xpathprop.getProperty("password");
	}

	public String loginbuttonxpath() {
		return xpathprop.getProperty("loginbutton");
	}

	public String logoutbuttonxpath() {

		return xpathprop.getProperty("logoutbutton");
	}

	// methods to call webelement xpath on customer searchpage
	public String inputemailcustomersearch() {
		return xpathprop.getProperty("email");
	}

	public String customermainmenubutton() {
		return xpathprop.getProperty("customermainmenu");
	}

	public String customersubmenubutton() {
		return xpathprop.getProperty("customersubmenu");
	}

	public String Customersearchbutton() {

		return xpathprop.getProperty("searchbutton");
	}

	public String tablecolumntwo() {
		return xpathprop.getProperty("tablecolumntwo");
	}
	
	@FindBy(id = "idOfYourElement")
	WebElement myLocator;
}