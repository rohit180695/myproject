package org.sdet40.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {
	@FindBy(xpath="//input[@name='Lastname']")
	private  WebElement actualLastNameText;
	@FindBy(xpath="//input[@name='Fristname']")
	private WebElement actualFristNameText;
	public LeadInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getFristNameText() {
		return actualFristNameText.getText();
	}
}
