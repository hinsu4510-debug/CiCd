package com.tfa.vtiger.runner;
import org.testng.annotations.*;

public class TestNGParameterDemo {
	@Test
	@Parameters({"i","j"})
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	
	@Test
	@Parameters({"i","j"})
	//i value will assign in a and j value will assign in b
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
	//Photo of xml file

}
