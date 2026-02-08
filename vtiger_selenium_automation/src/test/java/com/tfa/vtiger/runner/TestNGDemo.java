package com.tfa.vtiger.runner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class TestNGDemo {
	
	@Test//is used to tell the method that the method under this is test case
	public void verifyPageTitle() {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("http://www.google.com");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}
	//After executing testNG test we get 3 results 
	//1.  Console result
	//2.  Graphical result 
	//3.   TestNG report in test output after refreshing

}
