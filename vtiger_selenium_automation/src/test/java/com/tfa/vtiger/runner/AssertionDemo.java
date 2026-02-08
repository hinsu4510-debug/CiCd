package com.tfa.vtiger.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	@Test
	public void testMethod() {
		WebDriver driver=new ChromeDriver();
		SoftAssert softVerify=new SoftAssert();
		driver.get("https://testautomationpractice.blogspot.com");
		System.out.println("verify title");
		String expectedTitle="Automation Testing Practice1";
		softVerify.assertEquals(driver.getTitle(), expectedTitle);
		
		System.out.println("verifying presence of wikipedia.com");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());
		
		//report all failure messages
		softVerify.assertAll();
		
	}

}
