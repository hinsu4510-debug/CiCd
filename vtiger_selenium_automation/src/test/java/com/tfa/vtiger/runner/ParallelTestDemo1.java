package com.tfa.vtiger.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo1 {
	
	WebDriver driver;
	@Test
	public void verifyTitle() throws InterruptedException {
		//Launch chrome browser
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	
	@Test
	public void verifLogo() {
		//Launch chrome browser
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		WebElement logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		driver.quit();
	}

}
