package org.eva.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class Loginpage {
	private WebUtil wu;
	
	public Loginpage(WebUtil vt) {
		this.wu=vt;
		PageFactory.initElements(wu.getDriver(),this); 
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement userPassword;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginButton;

	
	public void enterUserName(String value) {
		wu.sendKeys(userName,value);
	}
	
	public void enterUserPassword(String value) {
		wu.sendKeys(userPassword, value);
	}
	
	public void clickOnSubmitButton() {
		wu.click(loginButton);
	}
	
	
	
}
