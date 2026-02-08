package org.eva.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class RedBusClass {
private WebUtil wu;
	
	public RedBusClass(WebUtil vt) {
		this.wu=vt;
		PageFactory.initElements(wu.getDriver(),this);
	}
	
	@FindBy (xpath="//div[@class='inputAndSwapWrapper___f20127")
	private WebElement searchboxFrom;
	
	@FindBy(xpath="//i[@class='icon___bfd1f2 icon icon-dropping_point']")
	private WebElement searchboxTo;
	
	@FindBy (xpath="//button[@class='primaryButton___93b44e searchButtonWrapper___7072ae ']")
	private WebElement seachtool;
	
	public void clickonFrom() {
		wu.actionsClick(searchboxFrom);
	}
	
	public void clickonTo() {
		wu.actionsClick(searchboxTo);
	}
	
	public void search() {
		wu.actionsClick(seachtool);
	}
}
