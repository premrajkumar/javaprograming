package org.Ajio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearATextfield {
	@Test
	public void clear()
	{
		WebDriverManager.chromedriver().setup();
		//launches the chrome browser
		 WebDriver driver = new ChromeDriver();
		 //fetches the web app and waits until its load
		 //maximize the window
		 driver.manage().window().maximize();
		 //fetches the browser and wait until it is loaded
		 driver.get("file:///C:/Users/Recruise/Desktop/page2.html");
		 //enters baby into the text box t1
		 WebElement t2 = driver.findElement(By.id("t2"));
		 t2.sendKeys("sihi");
		 t2.sendKeys(Keys.CONTROL+"a");
		 t2.sendKeys(Keys.DELETE);
		 //identifies the frame
		 WebElement fr = driver.findElement(By.id("f1"));
		 //switches the control to the specified frame
		 driver.switchTo().frame(fr);
		 //enters the baby(data) into the textbox t2 
		 WebElement t1 = driver.findElement(By.id("t1"));
		 t1.sendKeys("baby");
		 t1.sendKeys(Keys.CONTROL+"a");
		 t1.sendKeys(Keys.DELETE);
		 
	}
}
