package com.tfa.vtiger.testscripts;

import java.io.IOException;
import java.lang.reflect.Method;

import org.eva.vtiger.pages.Basepage;
import org.eva.vtiger.pages.Leadslandingpage;
import org.eva.vtiger.pages.Loginpage;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.tfa.vtiger.utils.WebUtil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
	
	protected WebUtil wuc=new WebUtil();
	private static ExtentReports er;
	private ExtentTest extTest;

	@BeforeSuite
	public void beforeSuite() {
	    er=new ExtentReports();
		ExtentSparkReporter esr=new ExtentSparkReporter(".//Reports//vtiger_automation_reports.html");
		er.attachReporter(esr);
	}
	
	//@Parameters({"browser"})
	@BeforeMethod
	public void login(Method mt) {
		//wuc.launchBrowser(browsername);
		String name=mt.getName();
		extTest=er.createTest(name);
		wuc.setExtentTest(extTest);
		wuc.launchBrowser("chrome");
		System.out.println("Before Class executed");
		
	}
	
//	@AfterMethod
//	public void signOut() {
//		Basepage bp=new Basepage(wuc);
//		bp.clickOnAdminButton();
//		bp.signout();
//	}
	
//	@AfterClass
//	public void quitBrowser() {
//		System.out.println("After Class executed");
//
//	}
//	
//	@Parameters({"browser"})
//	@BeforeMethod
//	public void login(String browserName) {
//		 wu.launchBrowser(browserName);
		
//	}
	@AfterMethod
	public void afterTestCase(ITestResult itr,Method mt) throws IOException {
		if(!itr.isSuccess()) {
			String testName=mt.getName();
			String screenShotPath=wuc.takeScreenShot(testName);
			extTest.addScreenCaptureFromPath(screenShotPath);
		}
		wuc.closeBrowser();
		er.flush();
		
	}
}

