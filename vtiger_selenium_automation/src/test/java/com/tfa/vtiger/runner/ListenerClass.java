package com.tfa.vtiger.runner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	public void onStart(ITestContext result) {
	System.out.println("on start method invoke");	
	}
	
	public void onFinish(ITestContext result) {
		System.out.println("on finish method invoke");	
		}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("name of method failed:"+result.getName());	
		}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("name of method skipped:"+result.getName());	
		}
	
	public void onTestStart(ITestResult result) {
		System.out.println("name of method started:"+result.getName());	
		}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("name of method successfuly executed:"+result.getName());	
		}
	

}
