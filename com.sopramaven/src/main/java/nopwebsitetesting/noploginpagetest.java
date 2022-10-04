package nopwebsitetesting;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class noploginpagetest extends baseclass {

	baseclass obj = new baseclass();

	@Test
	public void logintest() throws InterruptedException, IOException {

		noplogin.adminfield(conf.getUserName());
		log.info("email enter succesfully");
		noplogin.passwordfield(conf.getPass());
		log.info("password enter sucessfully");
		obj.takescreenshot(driver, "loginpage");
		log.info("screenshot taken");
		noplogin.clickonlogin();
		log.info("login sucessfully");
		obj.takescreenshot(driver, "homepage");
		Assert.assertEquals(conf.gethomepagetitle(), driver.getTitle());
		System.out.println(readxpathfile.xpathprop.getProperty("username"));
		System.out.println(readpropfile.prop.getProperty(""));

	}

	@Test
	public void logouttest() throws IOException {

		obj.takescreenshot(driver,"logouttest-homepage");
		noplogin.clickonlogoutbutton();
		log.info("user click on logou buttin");
		obj.takescreenshot(driver,"logouttest-loginpage");
		Assert.assertEquals(conf.getloginpagetitle(), driver.getTitle());
		
	}

}