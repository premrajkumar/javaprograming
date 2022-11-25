package org.Ajio;

import org.Ajio.Generic.BaseClass;
import org.Ajio.ObjectRepo.ChooseBrands;
import org.Ajio.ObjectRepo.Home_KitchenPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AjioTest extends BaseClass {
	@Test
	public void main()
	{
		common.tabClick();
		Home_KitchenPage hk = new Home_KitchenPage(driver);
		hk.clickBrands();
		hk.clickMore();
		ChooseBrands chse = new ChooseBrands(driver);
		//driver.findElement(By.xpath("//span[.='AMBADI']")).click();
		//web.switchTowindow(driver, "https://www.ajio.com/c/8312");
		//driver.findElement(By.xpath("//input[@value='AMBADI']")).click();
		//driver.findElement(By.xpath("//label[@for='modal-AMBADI']")).click();
		String amb = excel.getDataFromExcelBySheet("Sheet1", 1, 0);
		chse.specifyCondition(amb);
		String cd = excel.getDataFromExcelBySheet("Sheet1", 2, 0);
		chse.specifyCondition(cd);
		String fg = excel.getDataFromExcelBySheet("Sheet1", 3, 0);
		chse.specifyCondition(fg);
		chse.clickApplybtn();
		WebElement prod1 = hk.retproduct1();
		web.intializeJavascriptExecutor(driver);
		web.scrollTillElementUsingJS(prod1);
		String price1 = hk.getproduct1();
		String[] prr1 = price1.split("₹");
		System.out.println(prr1[1]);
		int pr1 = Integer.parseInt(prr1[1]);
		WebElement prod2 = hk.retproduct2();
		web.scrollTillElementUsingJS(prod2);
		String price2 = hk.getproduct2();
		String[] prr2 = price2.split("₹");
		int pr2 = Integer.parseInt(prr2[1]);
		if(pr1<pr2)
		{
			System.out.println(pr1);
		}
		else
		{
			System.out.println(pr2);
		}
		
	}

}
