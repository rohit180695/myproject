package org.sdet40.TestNGpractice;

import org.generic.BaseClass;
import org.generic.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sdet40.ObjectRepository.CreateNewLeadPage;
import org.sdet40.ObjectRepository.LeadInformationPage;
import org.sdet40.ObjectRepository.LeadPage;
//import org.sdet40.ObjectRepository.TabNames;
import org.testng.annotations.Test;

public class CreateLeadsDeleteTest {
	@FindBy(name="DeleteLeadName")
	private WebElement SelectLeadName;
	@FindBy(xpath="//input[@text()='Delete']")
	private WebElement DeleteButton;
	
	public CreateLeadsDeleteTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickDeleteButton() {
		DeleteButton.click();
	}
	

	
	
}
