package org.eva.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class Opportunitieslandingpage {
	
private WebUtil wu;
	
	public Opportunitieslandingpage(WebUtil vt) {
		this.wu=vt;
		PageFactory.initElements(wu.getDriver(),this);
	}
	
	
	@FindBy(xpath="//a[@href='index.php?module=Potentials&action=index']")
	private WebElement opportunityLink;
	
	@FindBy(name="potentialname")
	private WebElement opportunityTextBox;
	
	@FindBy(xpath="//select[@id='related_to_type']")
	private WebElement relatedToTextBox;
	
	@FindBy(xpath="//input[@id='jscal_field_closingdate']")
	private WebElement expectedCloseDateBox;
	
	@FindBy(xpath="//input[@name='amount']")
	private WebElement amountTextBox;
	
	@FindBy(xpath="//input[@id='nextstep']")
	private WebElement nextstepBox;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceBox;
	
	@FindBy(xpath="//input[@id='probability']")
	private WebElement probalityTextBox;
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campaignSourceTextBox;
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	private WebElement allSelectCheckBox;
	
	@FindBy(xpath="//select[@id='related_to_type']/parent::td/following-sibling::td[@class='dvtCellInfo']//img[@language='javascript']")
	private WebElement relatedToImageButton;
	
	public void clickOnOpportunityLink() {
		wu.click(opportunityLink);
	}
	
	public void opportunityTextBox(String value) {
		wu.click(opportunityTextBox);
		wu.sendKeys(opportunityTextBox,value);
	}
	
	public void relatedToTextBox() {
		wu.click(relatedToTextBox);
	}
	
	public void expectedCloseDateTextBox(String value) {
		wu.sendKeys(expectedCloseDateBox, value);
	}
	
	public void relatedToPlusButton() {
		wu.click(relatedToImageButton);
	}
	
	
	
	
}
