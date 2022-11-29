package nopwebsitetesting;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class noploginpagetest extends baseclass {

	baseclass obj = new baseclass();

	@Test(priority = 1)

	void logintest() throws InterruptedException, IOException {
		log.info("loginstart");
		noplogin.adminfield(conf.getUserName());
		noplogin.passwordfield(conf.getPass());
		obj.takescreenshot(driver, "loginpage");
		noplogin.clickonlogin();
		obj.takescreenshot(driver, "homepage");
		log.info("logincomplete");
		Assert.assertEquals(conf.gethomepagetitle(), driver.getTitle());
		log.info("loginpass");

	}

	@Test(priority = 2)
	public void logouttest() throws IOException {
		log.info("logoutstart");
		obj.takescreenshot(driver, "logouttest-homepage");
		noplogin.clickonlogoutbutton();
		obj.takescreenshot(driver, "logouttest-loginpage");
		log.info("logoutcomplete");
		Assert.assertEquals(conf.getloginpagetitle(), driver.getTitle());
		log.info("logoutpass");

	}

}
