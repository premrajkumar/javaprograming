package org.Ajio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingTask1Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		WebElement swto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(swto).perform();
//		driver.findElement(By.xpath("//a[.='Alerts']")).click();
////		driver.findElement(By.xpath("//body")).click();
//		WebElement dclick = driver.findElement(By.xpath("//div[@id='ad_position_box']"));
//		//WebElement dclick = driver.findElement(By.xpath("//body[@class='ng-scope']"));
//		act.doubleClick(dclick).perform();
		//dclick.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
	}

}
