package org.Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccRankings {
	@Test
	public void main() throws InterruptedException
	{
		//(//table/tbody/tr//td[@class='table-body__cell u-text-right rating'])=ratings
		
		//(//table/tbody/tr[@class='table-body']//span[@class='u-hide-phablet'])=country
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
//		List<WebElement> country = driver.findElements(By.xpath("//table/tbody/tr//span[2]"));
//		List<WebElement> ratings = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
//		
//		for(int i=0;i<country.size()-1;i++)
//		{
//		System.out.println(country.get(i).getText()+" = "+ratings.get(i).getText());
//		}
		
//		for(WebElement value1:country)
//		{
//	System.out.println(value1.getText()+" ");
//		}
//		
//		for(WebElement value:ratings)
//		{
//		System.out.println(value.getText()+" ");
//		}
//		
		List<WebElement> ele = driver.findElements(By.xpath("//table"));
		for(int j=0;j<ele.size();j++)
		{
		System.out.println(ele.get(j).getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
