package org.Flipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteNameInGoogle {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Prem Kumar");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	ArrayList<WebElement> l = new ArrayList<WebElement>(list);
	  WebElement i = l.get(3);
	  String hi = i.getText();
	  System.out.println(hi);
	  Thread.sleep(3000);
	  driver.quit();
		
	}

}
