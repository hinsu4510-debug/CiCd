package com.tfa.vtiger.runner;
import org.testng.annotations.*;

public class GroupAttribute {
	@Test(groups="software company")
	public void infosys() {
		System.out.println("infosys");
	}
	
	@Test(groups="software company")
	public void wipro() {
		System.out.println("wipro");
	}
	
	@Test(groups="automobile company")
	public void Maruti() {
		System.out.println("maruti");
	}
	
	@Test(groups="automobile company")
	public void tata() {
		System.out.println("tata");
	}




}
