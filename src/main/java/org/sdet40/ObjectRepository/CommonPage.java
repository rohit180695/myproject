package org.sdet40.ObjectRepository;

import org.generic.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	private WebDriver driver;
	private String dynamicXpath="//a[.='Xs']";
	//declaration
	@FindBy(xpath="//a[.='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']']") private WebElement adminstrationIcon;
	@FindBy(xpath="//a[.='Sign_Out']") private WebElement signoutLink;
	//intializtion all element variable
	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickRequiredTab(TabNames tabName, WebDriverUtility WebDriverUtility ) {
	WebDriverUtility.convertDynamicXpathIntoWebElement(dynamicXpath, tabName.toString(),driver).click();

	}
	//business Library
	public void clickLeadTab() {
		leadsTab.click();
	}
	public void signoutAction(WebDriverUtility webDriverUtility, WebDriver driver) {
		webDriverUtility.mouseHoverAction(driver, adminstrationIcon);
		webDriverUtility.convertDynamicXpathIntoWebElement(dynamicXpath, TabNames.Signout.getTabName(), driver).click();
	//	signoutLink.click();
	}
	

}
