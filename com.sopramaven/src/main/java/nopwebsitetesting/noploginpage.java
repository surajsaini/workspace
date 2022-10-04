package nopwebsitetesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class noploginpage {

	WebDriver driver;
	static readxpathfile xpathpropmethod;

	public noploginpage(WebDriver rdriver) throws IOException {

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

	public void clickonlogoutbutton() {
		driver.findElement(By.xpath(xpathpropmethod.logoutbuttonxpath())).click();
	}
	
	
}
