package org.sdet40.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadEditeTestPage {
	@FindBy(name="Firstname")
	private WebElement firstName;
	@FindBy(name="Lastname")
	private WebElement lastName;
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement saveBtn;

	public CreateNewLeadEditeTestPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public CreateNewLeadEditeTestPage(String actualFirstname, String actualLastname) {
		
		firstName.sendKeys(actualFirstname);
		lastName.sendKeys(actualLastname);
		saveBtn.click();
	}
		public void CreateNewLeadEditeTestPage(String expectedLeadFirstName, String expectedLeadLastName) {
	
		firstName.sendKeys(expectedLeadFirstName);
		lastName.sendKeys(expectedLeadLastName);
		saveBtn.click();		
	}
}
