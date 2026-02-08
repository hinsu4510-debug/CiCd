package com.tfa.vtiger.runner;

import org.testng.annotations.DataProvider;

public class DataProviderMethod {
	
	@DataProvider(name="searchDataSet")
	public Object[][] searchData(){
		Object[][] searchKeyword=new Object[3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="Qutub Minar";
		
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="Taj Mahal";
		
		searchKeyword[2][0]="Hyderabad";
		searchKeyword[2][1]="Charminar";
		
		return searchKeyword;
		
	}

}
