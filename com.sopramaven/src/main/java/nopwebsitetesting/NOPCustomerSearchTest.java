package nopwebsitetesting;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
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
		Thread.sleep(5000);
		// nopcust.entercustomersearchemail(conf.inputemailoncustomersearch());
		log.info("going to clear roles field");
	//	driver.findElement(By.xpath("//input[@role='searchbox']")).
		nopcust.entercustomersearchemail(conf.getancemail());
		// driver.findElement(By.xpath("//span[contains(@title,'delete')]")).click();
		log.info("cleared customer role");
		Thread.sleep(5000);
		nopcust.clickoncustomersearchbutton();
		Thread.sleep(5000);
		String ab = driver.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr[1]//td[2]")).getText();
		Assert.assertEquals(conf.getancemail(), ab);

	}
}