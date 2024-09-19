package practicepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver localDriver = new ChromeDriver();
		localDriver.manage().window().maximize();
		localDriver.manage().deleteAllCookies();
		localDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.set(localDriver);
	}

	@AfterMethod
	public void quit() {
		WebDriver localDriver = driver.get();
		localDriver.quit();
	}

	@Test(groups = { "must" }, priority = 0)
	public void google() {
		WebDriver localDriver = driver.get();
		localDriver.get("https://www.google.co.in/");
	}

	@Test(groups = { "must1" }, priority = 1)
	public void facebook() {
		WebDriver localDriver = driver.get();
		localDriver.get("https://www.facebook.com/");
	}

}
