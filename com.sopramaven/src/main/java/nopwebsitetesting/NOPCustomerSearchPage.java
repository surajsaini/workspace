package nopwebsitetesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NOPCustomerSearchPage {

	WebDriver driver;
	static readxpathfile xpathpropmethod;

	public NOPCustomerSearchPage(WebDriver rdriver) throws IOException {
		// this.driver = driver;
		driver = rdriver;

		xpathpropmethod = new readxpathfile();
	}

	//method for action on customersearch
	
	public void clickoncustomer() {
		driver.findElement(By.xpath(xpathpropmethod.customermainmenubutton()));
	}
	
	public void clickoncustomersubmenu() {
		driver.findElement(By.xpath(xpathpropmethod.customersubmenubutton())).click();
	}
	
		public void entercustomersearchemail(String searchemail) {		
			driver.findElement(By.xpath(xpathpropmethod.inputemailcustomersearch())).sendKeys(searchemail);
		}
		
		public void clickoncustomersearchbutton() {		
			driver.findElement(By.xpath(xpathpropmethod.Customersearchbutton())).click();
		}
		
		public String tablecolumntwotext() {
			
			return driver.findElement(By.xpath(xpathpropmethod.tablecolumntwo())).getText();
			
			return myLocator;
		}
	
}
