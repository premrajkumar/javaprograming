package org.Ajio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingTask2Test {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Frames.html");
//		WebElement swto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(swto).perform();
//		driver.findElement(By.xpath("//a[.='Frames']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hi");
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
