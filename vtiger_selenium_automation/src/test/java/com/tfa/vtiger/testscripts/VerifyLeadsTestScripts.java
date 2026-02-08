package com.tfa.vtiger.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.tfa.vtiger.utils.WebUtil;

public class VerifyLeadsTestScripts extends BaseTest {
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("myself King");
	}
    

	public void vt001VerifyLeadCreation() {
        WebUtil wu = new WebUtil();
		wu.launchBrowser("ChromeBrowser");
		wu.openURL("http://localhost:8888/");
		
		
	}

     @Test //This is annotation that defines it as a testng method
	public void ct002VerifyDeleteLead() {
		System.out.println("hello himanshu");

	}
     @Test(priority=0)
     public void hinsu() {
    	 System.out.println("this is hinsu method");
     }
     @Test(priority=2)
     public void aankaj() {
    	 System.out.println("this is pankaj");
    	 
     }
     @Test(priority=0)
     public void method1() {
    	 System.out.println("This is method1");
     }
     
     @BeforeMethod
     public void method2() {
    	 System.out.println("This is a before method");
     }
     
     @AfterMethod
     public void method3() {
    	 System.out.println("This is a after method");
     }
     
     @Test
     public void method4() {
    	 System.out.println("testmethod4");
     }
     
     @Test(priority=-4)
     public void method5() {
    	 System.out.println("methodtest 5");
     }
     
     @AfterClass
     public void method6() {
    	 System.out.println("This a method of after class");
     }
     
     @BeforeTest
     public void method7() {
    	 System.out.println("This is a method of before test");
     }
     
     @BeforeSuite
     public void h1hinsu() {
    	 System.out.println("this is method of before suite");
     }




}
