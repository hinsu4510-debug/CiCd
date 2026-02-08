package com.tfa.vtiger.runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataProviderDemo {
	
	//1. India         Qutub Minar
	//2. Agra           Taj Mahal
	//3. Hyderabad     Charminar
//	@DataProvider(name="searchDataSet")
//	public Object[][] searchData(){
//		Object[][] searchKeyword=new Object[3][2];
//		searchKeyword[0][0]="India";
//		searchKeyword[0][1]="Qutub Minar";
//		
//		searchKeyword[1][0]="Agra";
//		searchKeyword[1][1]="Taj Mahal";
//		
//		searchKeyword[2][0]="Hyderabad";
//		searchKeyword[2][1]="Charminar";
//		
//		return searchKeyword;
//		
//	}
	
	//@Test(dataProvider="searchDataSet")//Means we have to inject data from searchDataSet,when data provider method in the same class
	@Test(dataProvider="searchDataSet", dataProviderClass=DataProviderMethod.class)//When data provider method in another class
	public void testCaseGoogleSearch(String country,String monument) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		
		//enter key combination of country and monument
		searchbox.sendKeys(country+""+monument);
		
		driver.findElement(By.name("btnK")).submit();
		
	}
	//This will execute for 3 times for each data as shown 
	//Data provider method doesnot execute it only given to provide data and returns Object[][].
	//we can keep data provider in separate class as well

}
