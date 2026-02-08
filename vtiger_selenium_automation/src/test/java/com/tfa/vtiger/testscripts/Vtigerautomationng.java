package com.tfa.vtiger.testscripts;

import org.eva.vtiger.pages.Basepage;
import org.eva.vtiger.pages.Leadslandingpage;
import org.eva.vtiger.pages.Loginpage;
import org.eva.vtiger.pages.Opportunitieslandingpage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.tfa.vtiger.utils.WebUtil;

public class Vtigerautomationng extends BaseTest {






	@Test
	public void vt001verifyCreateLeads() {

		wuc.openURL("http://localhost:8888/");
		Loginpage lp=new Loginpage(wuc);

		lp.enterUserName("admin");
		lp.enterUserPassword("0000");
		lp.clickOnSubmitButton();
		Leadslandingpage llp= new Leadslandingpage(wuc);
		Basepage bp=new Basepage(wuc);
		llp.clickOnLeadsLink();
		bp.clickOnPlus();
		llp.firstNameBox("Ram");
		llp.lastNameBox("Singh");
		llp.companyNameBox("fratiy");
		llp.titleBox("politician");
		llp.assignedUserCircle();
		bp.clickOnSaveSmallButton();
	}

	@Test
	public void vt002verifyOpportunitiesCreate() {
		wuc.openURL("http://localhost:8888/");
		Loginpage lp=new Loginpage(wuc);

		lp.enterUserName("admin");
		lp.enterUserPassword("0000");
		lp.clickOnSubmitButton();
		Opportunitieslandingpage olp=new Opportunitieslandingpage(wuc);
		Basepage bp=new Basepage(wuc);
		olp.clickOnOpportunityLink();
		bp.clickOnPlus();
		olp.opportunityTextBox("hello");
		olp.expectedCloseDateTextBox("23-10-2025");
		bp.descriptionTextBox( "hiii hiii");
		//olp.relatedToPlusButton();
		//bp.clickOnSaveSmallButton();
		bp.clickOnLastViewButton();
		

	}


		
		public void vt003verifyLead() {
			wuc.openURL("http://localhost:8888/");
			Loginpage lp=new Loginpage(wuc);

			lp.enterUserName("admin");
			lp.enterUserPassword("0000");
			lp.clickOnSubmitButton();
			Leadslandingpage llp= new Leadslandingpage(wuc);
			Basepage bp=new Basepage(wuc);
			llp.clickOnLeadsLink();
			//String pageName=wuc.getPageTitle(); #To match the page directed we have to compare with page title or innertext and if page title then how?
			wuc.validateTextContains(llp.getInnerText(), "Leads", "lead page directed successful");
			
		}
	    @Test
		public void vt004editLead() {
			wuc.openURL("http://localhost:8888/");
			Loginpage lp=new Loginpage(wuc);

			lp.enterUserName("admin");
			lp.enterUserPassword("0000");
			lp.clickOnSubmitButton();
			Leadslandingpage llp= new Leadslandingpage(wuc);
			Basepage bp=new Basepage(wuc);
			llp.clickOnLeadsLink();
			bp.clickOnPlus();
			llp.firstNameBox("Shikar");
			llp.lastNameBox("Dhawan");
			llp.companyNameBox("braveh");
			llp.titleBox("Cricketer");
			llp.assignedUserCircle();
			bp.clickOnSaveSmallButton();
			wuc.mouseOver(llp.savePageLastNameBox());
			bp.saveEditLink();
			llp.lastNameEditColumn("Gabbar");
			bp.saveButtonEditBox();
			WebElement value=llp.savePageLastNameBox();
			wuc.validateTextEquals(value, "Orangee", "The result is :");
			
			
			
		}




}
