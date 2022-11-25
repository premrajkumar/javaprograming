package org.Ajio.Generic;

import org.Ajio.ObjectRepo.CommonPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected FileUtility file;
	private String url;
	protected CommonPage common;
	protected JavaUtility jv;
	protected WebDriver driver;
	public static JavaUtility sjv;
	public static WebDriver sdriver;
	
	/**
	 * intialize the all utility class
	 * open the excel, property file
	 * read the common data
	 * create the instance for browser(launch browser)
	 * maximize, implicit wait
	 * open the application
	 * intiallllllize jsexecutor, actions, webdriverwait
	 * create the instance for common object repo
	 */
	//@Parameters(value="browser")
	@BeforeClass(groups = "a")
	public void setupApp()
	{
		//create instance for the Generic Utility
		excel = new ExcelUtility();
		web = new WebDriverUtility();
		file = new FileUtility();
		jv = new JavaUtility();
		sjv=jv;
		
		//intiallize the property file and excelfile
		file.intializePropertyFile(IConstants.PROPERTY_FILE);
		excel.openExcelPage(IConstants.EXCEL);
		
		//fetch the data from property file
		url=file.getDataFromPropertyAfterIntialize("URL");
		
		//launching the browser and doing some browser setting
		driver=web.handleNotification();
		sdriver=driver;
		driver.manage().window().maximize();
		driver.get(url);
		
		//create object for common pom repo
		common = new CommonPage(driver);
	}
	
//	@AfterMethod(groups = "b")
//	public void logoutSuccess()
//	{
//		
//	}
//	
	@AfterClass(groups = "c")
	public void closeEntire()
	{
		web.closeTheApplication(driver);
		excel.closeExcelBook();	
	}
//	
//	//login to the application 
//	/**
//	 * when ever we create the testscript class for module and test annotation method for testcase
//	 * create the instance for browser(launch browser)
//	 * maximize,implicit wait
//	 * intiallize jsexecutor, actions, webdriverwait
//	 * create the instance for common object repo(driver)
//	 * login to the app
//	 */
//	@BeforeMethod
//	public void methodsetup1()
//	{
//		//login if credentials are same for all the test cases.
//	}
}
