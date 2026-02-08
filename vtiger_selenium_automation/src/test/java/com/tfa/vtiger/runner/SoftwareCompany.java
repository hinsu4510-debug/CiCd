package com.tfa.vtiger.runner;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompany {
	@Test
	@Parameters({"SoftwareCompanyName"})
	public void testCase1(String name) {
		System.out.println(name);
	}
	

}
