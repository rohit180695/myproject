package org.sdet40.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadEditeTestInformationPage {
	
    @FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
    private WebElement LeadsText;
    @FindBy(xpath="//input[@id='15']")
    private WebElement Click;
    @FindBy(xpath="//tr[@id='row_15']//a[contains(text(),'edit')]")
    private WebElement ClickText;
	@FindBy(xpath="//input[@name='Lastname']") 
	private WebElement actualLastNameText;
	@FindBy(xpath="//input[@name='Fristname']") 
	private WebElement actualFristNameText;

	public void LeadEditeTestInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
//	@FindBy(xpath="//input[@name='Lastname']")
//	private  WebElement actualLastNameText;
//	@FindBy(xpath="//input[@name='Fristname']")
//	private WebElement actualFristNameText;
	public LeadEditeTestInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getFristNameText() {
		return actualFristNameText.getText();
	}
}