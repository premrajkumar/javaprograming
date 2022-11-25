package org.Ajio;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserClose {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Follow On Twitter")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Like us On Facebook")).click();
		Thread.sleep(3000);
		String main = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		for(String value:allids)
		{
			if(!main.equals(value))
			{
				driver.switchTo().window(value);
				driver.close();
				Thread.sleep(3000);
			}
		}
	}

}
