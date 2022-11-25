package org.Flipkart;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTest {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("winter heater");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='DARSHANAM WORLD 220v 500w Portable Electric Heater Mini...']")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String s:ids)
		{
			driver.switchTo().window(s);
		}
		String protext = driver.findElement(By.xpath("//span[.='DARSHANAM WORLD 220v 500w Portable Electric Heater Mini Fan Heater Desktop Household Wall Handy Heating Stove Radiator Warmer Machine for Winter Electric Heater Mini Fan Heater Desktop Household Wall Handy Heating Stove Radiator Warmer Machine for Winter Fan Room Heater']")).getText();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		//String protext = driver.findElement(By.xpath("//span[.='DARSHANAM WORLD 220v 500w Portable Electric Heater Mini Fan Heater Desktop Household Wall Handy Heating Stove Radiator Warmer Machine for Winter Electric Heater Mini Fan Heater Desktop Household Wall Handy Heating Stove Radiator Warmer Machine for Winter Fan Room Heater']")).getText();
		//driver.findElement(By.xpath("//span[.='Cart']")).click();
		String protext1 = driver.findElement(By.xpath("//a[.='DARSHANAM WORLD 220v 500w Portable Electric Heater Mini Fan Heater Desktop Household Wall Handy Heating Stove Radiator Warmer Machine for Winter Electric Heater Mini Fan Heater Desktop Household Wall Handy Heating Stove Radiator Warmer Machine for Winter Fan Room Heater']")).getText();
		Assert.assertEquals(protext, protext1);
		System.out.println("Testcase is pass");
		driver.quit();
	}

}
