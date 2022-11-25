package org.Ajio.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseBrands {
	private WebDriver driver;
	private String brands="//label[@for='modal-%s']";
	
	@FindBy(xpath = "//button[.='Apply']")
	private WebElement applyButton;
	
	public ChooseBrands(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	private WebElement convertStringIntoCategoryWebelement(String required)
	{
		String actualvalue = String.format(brands, required);
		WebElement element = driver.findElement(By.xpath(actualvalue));
		return element;
	}
	 public  void specifyCondition(String condition)
	 {
		 convertStringIntoCategoryWebelement(condition.toString()).click();
	 }
	 
	 public void clickApplybtn()
	 {
		 applyButton.click();
	 }
}
