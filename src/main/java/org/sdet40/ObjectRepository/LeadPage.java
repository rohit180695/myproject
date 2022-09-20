package org.sdet40.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	@FindBy(xpath="//img[@title='Create Lead...']") private WebElement createLeadButton;
    public LeadPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void clickLeadButton() {
    	createLeadButton.click();
    }
}
