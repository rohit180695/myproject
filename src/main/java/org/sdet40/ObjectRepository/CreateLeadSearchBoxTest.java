package org.sdet40.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadSearchBoxTest {
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement SearchBox;
	@FindBy(name="FristName")
	private WebElement FristName;
	@FindBy(xpath="//input[@name='submit']")
	private WebElement Submit;
	public void clickSubmitButton() {
		Submit.click();
	}
}
