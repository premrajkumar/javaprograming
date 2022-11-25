package org.Ajio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingTask3Test {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Static.html");
//		WebElement interact = driver.findElement(By.xpath("//a[.='Interactions ']"));
		Actions act = new Actions(driver);
//		act.moveToElement(interact).perform();
//		driver.findElement(By.xpath("//a[.='Drag and Drop ']")).click();
//		driver.findElement(By.xpath("//a[.='Static ']")).click();
//		WebElement popup = driver.findElement(By.xpath("//body[@class='ng-scope']"));
//		act.doubleClick(popup).perform();
//		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("(//div[@class='col-xs-10 col-xs-offset-2'])[1]"));
		WebElement dst = driver.findElement(By.xpath("//div[@id='droparea']"));
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
