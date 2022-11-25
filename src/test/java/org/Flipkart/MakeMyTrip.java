package org.Flipkart;

import java.time.Duration;

import org.Ajio.Generic.FileUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		FileUtility file = new FileUtility();
		file.intializePropertyFile("./src/test/resources/ajio.properties");
		String Fromdata=file.getDataFromPropertyAfterIntialize("from");
		//String Fromdata = "BLR";
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Fromdata);
		
		driver.findElement(By.xpath("//div[text()='"+Fromdata+"']")).click();
		//driver.findElement(By.xpath("//a[@class='close']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
