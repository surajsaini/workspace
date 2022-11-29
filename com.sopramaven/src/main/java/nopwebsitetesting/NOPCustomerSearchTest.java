package nopwebsitetesting;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCustomerSearchTest extends baseclass {

	baseclass obj = new baseclass();
	NOPCustomerSearchPage nopcust;

	/*
	 * public NOPCustomerSearchTest() throws IOException { nopcust = new
	 * NOPCustomerSearchPage(driver); }
	 */

	@Test
	public void searchcustomerbyemail() throws InterruptedException, IOException {
		nopcust = new NOPCustomerSearchPage(driver);
		

		nopcust.adminfield(conf.getUserName());		
		nopcust.passwordfield(conf.getPass());
		nopcust.clickonlogin();
		log.info("login done, reach home page");
		Thread.sleep(5000);
		nopcust.clickoncustomer();
		Thread.sleep(2000);
		nopcust.clickoncustomersubmenu();
		nopcust.entercustomersearchemail(conf.inputemailoncustomersearch());
		nopcust.clickoncustomersearchbutton();
		Assert.assertSame(nopcust.tablecolumntwotext(), conf.firstnameintable());		
	}

}
