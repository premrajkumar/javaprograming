package org.Flipkart;

import java.time.Duration;

import org.Ajio.Generic.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TutorialsNinja {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://tutorialsninja.com/demo/");
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Your Store"))
		{
			System.out.println("Your Store is verified");
		}
		else
		{
			System.out.println("Your store is not verified");
		}
		WebElement comp = driver.findElement(By.xpath("//a[.='Components']"));
		Actions act = new Actions(driver);
		act.moveToElement(comp).perform();
		driver.findElement(By.xpath("//a[.='Monitors (2)']")).click();
		String pricenew = driver.findElement(By.xpath("//a[.='Apple Cinema 30\"']//parent::h4/following-sibling::p[@class='price']/span[@class='price-new']")).getText();
		System.out.println(pricenew);
		driver.findElement(By.xpath("//a[.='Apple Cinema 30\"']")).click();
		String pricenew1 = driver.findElement(By.xpath("//h2[.='$110.00']")).getText();
		Assert.assertEquals(pricenew, pricenew1);
		System.out.println("price is same");
		WebElement web = driver.findElement(By.xpath("//h3[.='Available Options']"));
		WebDriverUtility web1 = new WebDriverUtility();
		web1.intializeJavascriptExecutor(driver);
		web1.scrollTillElementUsingJS(web);
		driver.findElement(By.xpath("//input[@name='option[218]']")).click();
		driver.findElement(By.xpath("//input[@value='10']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//textarea[@placeholder='Textarea']")).sendKeys("Selenium4");
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		String text = driver.findElement(By.xpath("//div[.='File required!']")).getText();
		//File required!
		Assert.assertEquals(text,"File required!");
		System.out.println(text+" is verified");
		Thread.sleep(3000);
		driver.quit();
	}

}
