package org.Ajio.Generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener 
{
	private	ExtentReports rep;
	private ExtentTest test;
	public static ExtentTest stest;

	public void onTestStart(ITestResult result)
	{
		test = rep.createTest(result.getMethod().getMethodName());
		stest=test;
	}

	public void onTestSuccess(ITestResult result)
	{
		test.pass(result.getMethod().getMethodName()+"pass");
	}

	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getMethod().getMethodName()+"fail");
		test.fail(result.getThrowable());
		System.out.println(Thread.currentThread().getId());
		String path = new WebDriverUtility().screenShot(BaseClass.sdriver);
		test.addScreenCaptureFromBase64String(path);
		
		//this is used to store the screenshot photo in screenshot folder
		
		//new WebDriverUtility().screenShot(BaseClass.sjv,BaseClass.sdriver , result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		test.skip("Test1 skip");
		test.skip(result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter sp = new ExtentSparkReporter("./extentReport/extentreport.html");
		sp.config().setDocumentTitle("Document Title-SDET 40");
		sp.config().setReportName("Sales and inventory");
		sp.config().setTheme(Theme.DARK);
		
		rep = new ExtentReports();
		rep.attachReporter(sp);
		rep.setSystemInfo("Author", "prem");
		rep.setSystemInfo("OS", "win 11");
		rep.setSystemInfo("browser", "chrome");
	}

	public void onFinish(ITestContext context) 
	{
		rep.flush();
	}

}
