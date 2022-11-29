package nopwebsitetesting;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPAddNewCustomerTest extends baseclass {

	baseclass obj = new baseclass();
	NOPAddNewCustomerPage nopnewcust;

	@Test
	public void nopaddnewcuromer() throws IOException, InterruptedException {
		nopnewcust = new NOPAddNewCustomerPage(driver);

		log.info("addcuststart");
		nopnewcust.adminfield(conf.getUserName());		
		nopnewcust.passwordfield(conf.getPass());
		nopnewcust.clickonlogin();		
		nopnewcust.clickoncustomer();		
		nopnewcust.clickoncustomersubmenu();
		nopnewcust.clickonaddbutton();		
		nopnewcust.enteremail(conf.getancemail());
		nopnewcust.enterpassword(conf.getancpassword());
		nopnewcust.enterfirstname(conf.getancfirstname());
		nopnewcust.enterdob(conf.getancdob());		
		// obj.selectvalue(driver,"VendorId","2");
		
		Select value1 = new Select(driver.findElement(By.id("VendorId")));
		value1.selectByValue("2");
		Thread.sleep(1000);
		
		nopnewcust.clicksavebutton();
		log.info("addcustcomplete");
		Assert.assertEquals(nopnewcust.getalerttext(), "×");
		log.info("addcustpass");

	}

}
