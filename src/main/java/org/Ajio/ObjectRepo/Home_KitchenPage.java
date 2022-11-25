package org.Ajio.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_KitchenPage {
	
	@FindBy(xpath = "//span[.='brands']")
	private WebElement brandsbutton;
	
	@FindBy(xpath = "(//div[.='MORE'])[2]")
	private WebElement morebutton;
	
	@FindBy(xpath="//div[.='Printed Queen Bedsheet with Pillow Covers']/following-sibling::div/span[@class='price  ']")
	private WebElement costProduct1;
	
	@FindBy(xpath="//div[.='Floral Print Queen Bedsheet Set']/following-sibling::div/span[@class='price  ']")
	private WebElement costProduct2;
	
	 public Home_KitchenPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

	 public void clickBrands()
	 {
		 brandsbutton.click();
	 }
	 
	 public void clickMore()
	 {
		 morebutton.click();
	 }
	  public WebElement retproduct1()
	  {
		 return costProduct1;
	  }
	 public String getproduct1()
	 {
		 String price1 = costProduct1.getText();
		 return price1;
	 }
	 
	 public WebElement retproduct2()
	 {
		return costProduct2;
	 }
	 
	 public String getproduct2()
	 {
		 String price2 = costProduct2.getText();
		 return price2;
	 }
	  
}
