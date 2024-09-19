
package practicepackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {

	private static WebDriver driver;

	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void WebElementList() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");

		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("suraj");
		Thread.sleep(5000);
		List<WebElement> suggestion = driver
				.findElements(By.xpath(".//li[contains(@data-entityname,'S') or contains(@data-entityname,'s') ]"));

		System.out.println(suggestion.size());

		for (WebElement s1 : suggestion)
			System.out.println(s1.getText());

		driver.quit();

	}

	public static void HandleDropdown() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		WebElement coffeedropdown = driver.findElement(By.xpath(".//select[@name='coffee2']"));
		Select s = new Select(coffeedropdown);
		List<WebElement> web = s.getOptions();

		boolean b = s.isMultiple();
		if (b = true) {
			for (int i = 0; i < web.size(); i++) {
				s.selectByIndex(i);
				Thread.sleep(5000);
			}
			s.deselectByIndex(4);
		} else {
			s.selectByIndex(4);
		}
		// System.out.println(b);
		// driver.findElement(By.xpath("//select[@name='coffee']")).click();
		// driver.findElement(By.xpath("//select[@name='coffee']//option[@value='sugar']")).click();
		driver.quit();
	}

	public static void WebTable() {
		int count = 0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
		// driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> rows = driver.findElements(By.xpath(".//div[@class='rt-td']"));
//		WebElement s = driver.findElement(By.xpath(".//div[@class='rt-td']"));
		for (WebElement rowsprint : rows)
			if (rowsprint.getText().isBlank() == false) {
				count++;
				// System.out.println(rowsprint.getText());
			}
		for (int i = 1; i <= count / 6; i++) {
			String tt = driver.findElement(By.xpath(".//div[@class='rt-tbody']//div[" + i + "]//div[1]//div[3]"))
					.getText();
			String ss = driver.findElement(By.xpath(".//div[@class='rt-tbody']//div[" + i + "]//div[1]//div[1]"))
					.getText();
			System.out.println(ss + " age is " + tt);
		}
		// System.out.println(count);
	}

	public static void JavaScriptExecutor() throws InterruptedException, IOException {
		setup();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(5000);
		WebElement bb = driver.findElement(By.xpath(".//a[contains(text(),'demos')]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 10; i++) {
			j.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(5000);
			if (bb.isDisplayed() && bb.isEnabled()) {
				DemoQA.TakeScreenShot(driver, "suraj");
				bb.click();
				DemoQA.TakeScreenShot(driver, "suraj1");
				break;
			}
		}
		String ab = driver.getWindowHandle();
		Set<String> bc = driver.getWindowHandles();
		System.out.println(driver.switchTo().window(ab).getTitle());
		for (String cd : bc) {
			if (!cd.equals(ab)) {
				driver.switchTo().window(cd);
				System.out.println(driver.getTitle());
				break;
			}
		}
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		driver.switchTo().frame("content");
		WebElement ss1 = driver.findElement(By.xpath(".//input[@name='value']"));
		j.executeScript("arguments[0].value='surajtest';",ss1);
		j.executeScript("arguments[0].click();", driver.findElement(By.xpath(".//button[text()='Add']")));
		driver.switchTo().defaultContent();
	}

	public static void TakeScreenShot(WebDriver driver, String filename) throws IOException {
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// String datetime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String datetime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourcess = screenshot.getScreenshotAs(OutputType.FILE);
		String sspath = "C:\\SURAJ\\Backup_29122021\\Work\\Traning\\seleniumsep\\screenshot\\" + filename + "_"
				+ datetime + ".jpeg";
		File descss = new File(sspath);
		FileUtils.copyFile(sourcess, descss);

	}

	public static void nopWebsiteAdminLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//	WebDriverManager.edgedriver().setup();
		// WebDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		// driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.findElement(By.xpath(".//input[@id='Email']")).clear();
		driver.findElement(By.xpath(".//input[@id='Email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath(".//input[@id='Password']")).clear();
		driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys("admin");
		driver.findElement(By.xpath(".//button[text()='Log in']")).click();
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[10]/a[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[10]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Set<String> ab = driver.getWindowHandles();
		for (String bc : ab) {
			String ef = driver.switchTo().window(bc).getTitle();
			System.out.println(ef);
			if (ef.equals("nopCommerce online course for developers - nopCommerce")) {
				driver.close();
			}
		}

	}

	public static void customWait() {
		DemoQA.setup();
		driver.get("https://www.google.co.in/");
		String googletextbox = ".//textarea[@aria-label='Search']";
		String googlesearchbutton = ".//input[@type='submit' and @role='button' and contains(@data-ved,'BQ')]";
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Wait<WebDriver> waitF = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(TimeoutException.class);

		driver.findElement(By.xpath(googletextbox)).sendKeys("send flower to gzb");
		driver.findElement(By.xpath(googletextbox)).sendKeys(Keys.TAB);
		WebElement element = waitF.until(ExpectedConditions.elementToBeClickable(By.xpath(googlesearchbutton)));
		driver.findElement(By.xpath(googlesearchbutton)).click();

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		JavaScriptExecutor();

	}
}
