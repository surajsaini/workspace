package nopwebsitetesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	WebDriver driver;
	TakesScreenshot screenshot;
	Logger log = Logger.getLogger(baseclass.class);
	readpropfile conf;
	noploginpage noplogin;
	

	@BeforeClass
	public void setupApplication() throws IOException {

		Reporter.log("=====Browser Session Started=====", true);

		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  noplogin = new noploginpage(driver);
		  conf = new readpropfile();
	//	  driver.get(conf.getApplicationURL_QA());
		 

		log.info("=====Application Started=====");
	}

	@AfterClass
	public void closeApplication() {
	//	driver.quit();
		Reporter.log("=====Browser Session End=====", true);
	}

	public void takescreenshot(WebDriver driver, String filename) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File screenshotpath = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotpath, new File("C:\\SURAJ\\Backup_29122021\\Work\\Traning\\seleniumsep\\screenshot\\"+filename+".jpeg"));
	}

}
