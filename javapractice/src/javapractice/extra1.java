package javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class extra1 extends baseclass{

static WebDriver driver;

@Test	
public static void main(String[] args) {
		
		

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		WebDriver rdriver = null;
		driver = rdriver;

		WebElement w = driver.findElement(By.xpath(""));
	}
}
