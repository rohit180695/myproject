package org.sdet40.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {

//	public static void main(String[] args) {
		@FindBy(name="user_name") private WebElement usernameTextFiled;
		@FindBy(name="user_password") private WebElement passwordTextFiled;
		@FindBy(xpath="//a[text()='Leads']") private WebElement LeadTab;
		@FindBy(name="firstname")private WebElement firstName;
		@FindBy(name="lastname")private WebElement lastName;
		@FindBy(xpath="//input[@class='crmButton small save']") private WebElement saveBtn;
	}


