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
		driver.findElement(By.xpath("//span[contains(@title,'delete')]")).click();
		log.info("cleared customer role");
		Thread.sleep(5000);
		nopcust.clickoncustomersearchbutton();
		Thread.sleep(5000);
		// Assert.assertSame(nopcust.tablecolumntwotext(), conf.firstnameintable());

//	//	String column2[] = new String[15]; 
//		
//		ArrayList<String> column3 = new ArrayList<>(); 
//
//		for (int i = 1; i < 5; i++) {
//
//			String W = driver.findElement(By.xpath("//table[contains(@id,'customers-grid')]//tr[" + i + "]/td[3]"))
//					.getText();
//			column3.add(W);		
//		
//		}					
//		System.out.println(column3);
//		System.out.println(conf.firstnameintable());
//		Assert.assertTrue(column3.equals(conf.firstnameintable().toString()));
//		
//	//	Assert.assertTrue(  column3.contains(conf.firstnameintable()));
//	}
//
//}

		for (int j = 1; j < 12; j++) {
			for (int i = 1; i < 15; i++) {

				String W = driver.findElement(By.xpath("//table[contains(@id,'customers-grid')]//tr[" + i + "]/td[3]"))
						.getText();

				if (W.equals(conf.firstnameintable())) {

					System.out.println("matching");
				}
				System.out.println(i);
				System.out.println(j);
			}

			{
				driver.findElement(By.xpath("//li[contains(@class,'item next')]")).click();
			}

		}

	}

}
