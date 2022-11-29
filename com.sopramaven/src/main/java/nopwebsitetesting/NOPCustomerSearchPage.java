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

	
	public void adminfield(String email) {
		driver.findElement(By.xpath(xpathpropmethod.usernamexpath())).clear();
		driver.findElement(By.xpath(xpathpropmethod.usernamexpath())).sendKeys(email);
	}

	public void passwordfield(String password) {
		driver.findElement(By.xpath(xpathpropmethod.passwordxpath())).clear();
		driver.findElement(By.xpath(xpathpropmethod.passwordxpath())).sendKeys(password);
	}

	public void clickonlogin() throws IOException {
		driver.findElement(By.xpath(xpathpropmethod.loginbuttonxpath())).click();
	}
	
	//method for action on customersearch
	
	public void clickoncustomer() {
		driver.findElement(By.xpath(xpathpropmethod.customermainmenubutton())).click();
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
			
			
		}
	
}
