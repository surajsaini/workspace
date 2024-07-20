
package practicepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import nopwebsitetesting.baseclass;

public class DemoQA extends baseclass {
	// public class NOPAddNewCustomerTest extends baseclass {

public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/checkbox");	
//	driver.quit();

	}

}
