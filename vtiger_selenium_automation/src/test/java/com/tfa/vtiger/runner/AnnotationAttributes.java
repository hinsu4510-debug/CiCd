package com.tfa.vtiger.runner;
import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationAttributes {
	@Test(dependsOnMethods= {"testCase2","testCase3"})
	public void testCase1() {
		System.out.println("Mobile login testcase");
		
	}
	
	//@Test(description="This is testCase2")
	//@Test(timeOut=200)
	@Test
	public void testCase2() {
		
		System.out.println("Web login testcase");
		Assert.assertTrue(false);
		//If test case is using much time and we want them to execute within limited time
		//testCase2 will get failed but rest of the test will get executed
	}
	
	
	@Test
	//description is added when we want to give description about the test case
	public void testCase3() {
		System.out.println("Api login testcase");
		
	}
	//@Test(priority=1)
	//When we dont set the priority it means its priority is by default 0 and be executed first
    
	
	//@Test(dependsOnMethods= {"testCase2"})
	//It means firstly testCase2 then after testcase method will execute where depend is added
	//If testCase2 got failed then then that method will not execute where depend is 
	//We can add multiple methods separated by comma

	
	//@Test(enabled=false)
	//the particular test will not get executed or we can say that it will skip
	//by default it is true
}
