package org.Flipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccworldcupWomemPlayersTest {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.t20worldcup.com/");
		driver.findElement(By.xpath("//a[contains(.,'ICC RANKINGS')]")).click();
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<>(ids);
		driver.switchTo().window(list.get(1));
		WebElement ele = driver.findElement(By.xpath("(//button[contains(.,'Rankings')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[contains(.,'Player Rankings')])[1]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
