//package com.tfa.vtiger.runner;
//
//import org.tfa.vtiger.utils.WebUtil;
//
//public class LeadsPage {
//	public WebUtil wu=new WebUtil();
//	public void loginMethod() {
//		//WebUtil wu=new WebUtil();
//		wu.openURL("http://localhost:8888/");
//		wu.sendKeys("//input[@name='user_name']","admin");
//		wu.sendKeys("//input[@name='user_password']","0000");
//		wu.click("(//input[@value='Login'])[2]");
//	
//	}
//	public void createLead() {
//		loginMethod();
//		wu.click("//a[text()='Leads']");
//		//wu.validateTextContains("//a[@class='hdrLink']","Leads","pas");
////		String textValue=wu.getText("//a[@class='hdrLink']");
////		boolean a=textValue.equalsIgnoreCase("Leads");
////		if(a==true) {
////			System.out.println("Successfully navigate to the leads page");
////		}else 
////		{
////			System.out.println("The page is incorrect");
////		}
//		wu.click("//img[contains(@alt,'Create Lead...')]");
//		wu.sendKeys("//input[@name='firstname']","Virat");
//		wu.sendKeys("//input[@name='lastname']","Kohli");
//		wu.sendKeys("//input[@name='company']","Wrong");
//		wu.click("//b[text()='Lead Information']/ancestor::td[@colspan='4']/parent::tr/preceding-sibling::tr//input[@class='crmButton small save']");
//		//String firstValue=wu.getText("//span[@id='dtlview_First Name']");
//		wu.validateTextEquals("//span[@id='dtlview_First Name']","Rohit","correct");
//		System.out.println("Test is completely executed");
//	}
//
//}
