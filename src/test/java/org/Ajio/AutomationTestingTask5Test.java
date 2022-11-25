package org.Ajio;

import java.time.Duration;

import org.Ajio.Generic.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingTask5Test {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:/Qspiders/Agile document.txt");
		WebElement ele = driver.findElement(By.xpath("//span[.='Upload']"));
		WebDriverUtility web = new WebDriverUtility();
		web.intializeJavascriptExecutor(driver);
		web.scrollTillElementUsingJS(ele);
		ele.click();
		Thread.sleep(3000);
		driver.quit();
		
	}


}
