package org.eva.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class Leadslandingpage {
	
private WebUtil wu;
	
	public Leadslandingpage(WebUtil vt) {
		this.wu=vt;
		PageFactory.initElements(wu.getDriver(),this);
	}
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadsText;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameBox;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameBox;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyNameBox;
	
	@FindBy(xpath="//input[@id='designation']")
	private WebElement titleBox;
	
	@FindBy(xpath="//input[@value='U']")
	private WebElement assignedUserCircle;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement assignedGroupCircle;
	
	@FindBy(xpath="//a[text()='Leads']/parent::td[@class='moduleName']")
	private WebElement pageInnerText;
	
	@FindBy(xpath="//td[@id='mouseArea_Last Name']")
	private WebElement savePageLastNameBox;
	
	@FindBy(xpath="//input[@id='txtbox_Last Name']")
	private WebElement lastNameEditColumn;
	
	public void lastNameEditColumn(String value) {
		wu.sendKeys(lastNameEditColumn, value);
	}
	
	public WebElement savePageLastNameBox() {
		return savePageLastNameBox;
	}
	
	public WebElement getInnerText() {
		return pageInnerText;
	}
	
	public void firstNameBox(String value) {
		wu.sendKeys(firstNameBox,value);
	}
	
	public void clickOnLeadsLink() {
		wu.click(leadsText);
	}
	
	public WebElement lastNameBox(String value) {
		wu.sendKeys(lastNameBox,value);
		return lastNameBox;
	}
	
	public void companyNameBox(String value) {
		wu.sendKeys(companyNameBox,value);
	}
	
	public void titleBox(String value) {
		wu.sendKeys(titleBox,value);
	}
	
	public void assignedUserCircle() {
		wu.click(assignedUserCircle);
	}
	
	public void assignedGroupCircle() {
		wu.click(assignedGroupCircle);
	}
	



}
