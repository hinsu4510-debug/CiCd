package com.tfa.vtiger.runner;
import org.testng.annotations.*;

public class LoanDepartment {
	@Test(enabled=false) //this test will not execute
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile login Personal Loan");
	}
	
	@Test(enabled=true)
	public void WebLoginPersonalLoan() {
		System.out.println("Web login Personal Loan");
	}
	@Test(enabled=false)
	public void ApiLoginPersonalLoan() {
		System.out.println("Api login Personal Loan");
	}
	@Test//By default they are enabled
	public void ApiLoginAutoMobileLoan() {
		System.out.println("Api login Automobile Loan");
	}
	@Test
	public void WebLoginAutoMobileLoan() {
		System.out.println("Web login Automobile Loan");
	}
	@Test
	public void MobileLoginAutoMobileLoan() {
		System.out.println("Mobile login Automobile Loan");
	}

}
