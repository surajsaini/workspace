package nopwebsitetesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NOPAddNewCustomerPage {

	WebDriver driver;
	static readxpathfile xpathpropmethod;

	public NOPAddNewCustomerPage(WebDriver rdriver) throws IOException {
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

	public void enteremail(String ancemail) {
		driver.findElement(By.xpath(xpathpropmethod.ancemail())).sendKeys(ancemail);
	}

	public void enterpassword(String ancpassword) {

		driver.findElement(By.xpath(xpathpropmethod.ancpassword())).sendKeys(ancpassword);
	}
	
	public void enterfirstname(String ancfirstname) {
		driver.findElement(By.xpath(xpathpropmethod.ancfirstname())).sendKeys(ancfirstname);
	}

	public void enterdob(String ancdob) {

		driver.findElement(By.xpath(xpathpropmethod.ancdob())).sendKeys(ancdob);
	}

	public void clicksavebutton() {
		driver.findElement(By.xpath(xpathpropmethod.ancsavebutton())).click();

	}
	
	public void clickoncustomer() {
		driver.findElement(By.xpath(xpathpropmethod.customermainmenubutton())).click();
	}
	
	public void clickoncustomersubmenu() {
		driver.findElement(By.xpath(xpathpropmethod.customersubmenubutton())).click();
	}
	
	public void clickonaddbutton() {
		driver.findElement(By.xpath(xpathpropmethod.ancaddbutton())).click();
	}
	
	public String getalerttext() {		
		return driver.findElement(By.xpath(xpathpropmethod.ancalerttext())).getText();
	}
}
