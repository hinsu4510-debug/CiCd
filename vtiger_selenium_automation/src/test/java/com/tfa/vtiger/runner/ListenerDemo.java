package com.tfa.vtiger.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.tfa.vtiger.runner.ListenerClass.class)
public class ListenerDemo {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		By x=By.name("user_name");
		WebElement y=driver.findElement(x);
		y.sendKeys("admin");
		By z=By.name("user_password");
		WebElement a=driver.findElement(z);
		a.sendKeys("0000");
		
		
		Assert.assertEquals(y.getAttribute("value"), "admin");
		
	
		
	}
	@Test
	public void failTest() {
		System.out.println("Failed Test Case");
		Assert.assertTrue(false);
	}
	
	@Test
	public void skipTest() {
		System.out.println("Skipked Test Case");
		throw new SkipException("skip exception is thrown");
	}

}
