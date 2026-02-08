package org.eva.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class Basepage {
	
private WebUtil wu;
	
	public Basepage(WebUtil vt) {
		this.wu=vt;
		PageFactory.initElements(wu.getDriver(),this);
	}
	
	@FindBy(xpath="//img[contains(@alt,'Create')]")
	private WebElement plusButton;
	
	@FindBy(xpath="//img[contains(@alt,'Search in')]")
	private WebElement searchInButton;
	
	@FindBy(xpath="//img[contains(@alt,'Open Calendar')]")
	private WebElement calendarButton;
	
	@FindBy(xpath="//img[contains(@title,'Show World Clock...')]")
	private WebElement worldClockButton;
	
	@FindBy(xpath="//img[contains(@title,'Open Calculator')]")
	private WebElement calculatorButton;
	
	@FindBy(xpath="//img[contains(@title,'Chat...')]")
	private WebElement chatButton;
	
	@FindBy(xpath="//img[contains(@title,'Last Viewed')]")
	private WebElement lastViewButton;
	
	@FindBy(xpath="//img[contains(@title,'Import')]")
	private WebElement importButton;
	
	@FindBy(xpath="//img[contains(@title,'Export')]")
	private WebElement exportButton;
	
	@FindBy(xpath="//img[contains(@title,'Find Duplicates')]")
	private WebElement duplicatesButton;
	
	@FindBy(xpath="//img[contains(@title,'Settings')]")
	private WebElement settingsButton;
	
	@FindBy(xpath="//input[@class='crmButton small save' or @class='crmbutton small save']")
	private WebElement saveSmallButton;
	
	@FindBy(xpath="//div[@id='editarea_Last Name']/input[@class='crmbutton small save']")
	private WebElement saveButtonEditBox;
	
	public void saveButtonEditBox() {
		wu.click(saveButtonEditBox);
	}
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logout;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminButton;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descrptionTextBox;
	
	@FindBy(xpath="//span[@id='crmspanid']")
	private WebElement saveEditLink;
	
	public void saveEditLink() {
		wu.click(saveEditLink);
	}
	
	public void clickOnPlus() {
		wu.click(plusButton);
	}
	
	public void searchInButton() {
		wu.click(searchInButton);
	}
	
	public void clickOncalendarButton() {
		wu.click(calendarButton);
	}

	
	public void clickOnWorldClockButton() {
		wu.click(worldClockButton);
	}

	
	public void clickOnCalculatorButton() {
		wu.click(calculatorButton);
	}

	
	public void clickOnChatButton() {
		wu.click(chatButton);
	}

	
	public void clickOnLastViewButton() {
		wu.click(lastViewButton);
	}

	
	public void clickOnImportButton() {
		wu.click(importButton);
	}

	
	public void clickOnExportButton() {
		wu.click(exportButton);
	}

	
	public void clickOnDuplicatesButton() {
		wu.click(duplicatesButton);
	}
	
	public void clickOnSettingsButton() {
		wu.click(settingsButton);
	}
	
	public void clickOnSaveSmallButton() {
		wu.click(saveSmallButton);
	}
	
	public void signout() {
		wu.click(logout);
	}
	
	public void clickOnAdminButton() {
		wu.click(adminButton);
	}
	
	public void descriptionTextBox(String text) {
		wu.sendKeys(descrptionTextBox, text);
	}
	



}
