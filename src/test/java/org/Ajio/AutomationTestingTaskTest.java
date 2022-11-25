package org.Ajio;

import java.awt.AWTException;
import java.time.Duration;

import org.Ajio.Generic.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingTaskTest {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("rokhade");
		driver.findElement(By.xpath("//textarea")).sendKeys("njnddcvgcgfhgcvnbb");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcd44@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9874563210");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@id='msdd']"));
		WebDriverUtility web = new WebDriverUtility();
		web.intializeJavascriptExecutor(driver);
		web.scrollTillElementUsingJS(ele);
		ele.click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//a[.='English']")).click();
		//driver.findElement(By.xpath("//label[.='Languages']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s1 = new Select(ele1);
		s1.selectByVisibleText("APIs");
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s2 = new Select(ele3);
		s2.selectByVisibleText("Select Country");
		//(//span[@class='selection'])
		driver.findElement(By.xpath("//b[@role='presentation']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ind");
		driver.findElement(By.xpath("//li[.='India']")).click();
		WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1920");
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4 = new Select(month);
		s4.selectByVisibleText("February");
		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select s5 = new Select(day);
		s5.selectByVisibleText("3");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
