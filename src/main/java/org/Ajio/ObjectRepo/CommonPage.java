package org.Ajio.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	
	@FindBy(xpath = "//a[.='HOME AND KITCHEN']")
	private WebElement homekittab;
		
	public CommonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void tabClick()
	{
		homekittab.click();
	}

}
