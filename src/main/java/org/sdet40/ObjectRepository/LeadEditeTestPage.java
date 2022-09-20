package org.sdet40.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadEditeTestPage {
	@FindBy(xpath="//href[@text()='edit']")
	private WebElement EditButton;
	@FindBy(xpath="//input[@title='Save[Alt+S]']")
	private WebElement SaveButton;
	@FindBy(xpath="//input[@name='Lastname']")
	private  WebElement actualLastNameText;
    @FindBy(xpath="//input[@name='Fristname']")
	private WebElement actualFristNameText;
	
	public void CreateLeadEditeTestPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickeditButton() {
		EditButton.click();
	}
}
