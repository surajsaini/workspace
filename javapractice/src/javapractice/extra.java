package javapractice;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extra {

	WebDriver driver;

	@Test
	public void extra1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'pills')]/li[4]")).click();
		System.out.println("1");
		driver.findElement(By.xpath("//ul//a[contains(@href,'/Admin/Customer/List')]")).click();
		driver.findElement(By.xpath("//span[contains(@title,'delete')]")).click();
		System.out.println("2");
		// driver.findElement(By.xpath("//input[contains(@id,'First')]")).sendKeys("James");
		driver.findElement(By.xpath("//button[contains(@id,'search')]")).click();

		for (int j = 1; j < 20; j++) {
			for (int i = 1; i < 15; i++) {

				String W = driver.findElement(By.xpath("//table[contains(@id,'customers-grid')]//tr[" + i + "]/td[3]"))
						.getText();

				if (W.equals("James Pan")) {

					System.out.println("matching");
					break;
				}
				System.out.println(W);
				System.out.println(j);
			}

			{
				Thread.sleep(3000);
				driver.findElement(By.xpath("//li[contains(@class,'item next')]")).click();
			}

		}

	}

}