package org.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sdet40.ObjectRepository.CommonPage;
import org.sdet40.ObjectRepository.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected WebDriver driver;
	private LoginPage loginPage;
	private String userName;
	private String password;
	protected CommonPage commonPage;
	protected WebDriverUtility webDriverUtility;
	protected ExcelUtility excelUtility;
	protected FileUtility fileUtility;
	protected JavaUtility javaUtility;
	protected int randomNumber;
	protected long longTimeouts;
	public static WebDriver sdriver;
	public static JavaUtility sjavaUtility;


	@BeforeClass
	public void classSetup() throws IOException {

		excelUtility=new ExcelUtility();

		fileUtility=new FileUtility();
		webDriverUtility=new WebDriverUtility();
		javaUtility=new JavaUtility();
		sjavaUtility=javaUtility;
		excelUtility.initilaizeExcel(IConstant.EXCE_PATH);
		fileUtility.initializaPropertyFile(IConstant.PROPERTY_FILE_PATH);
		//excelUtility.openExcel(IConstant.EXCE_PATH);

		String browser=fileUtility.getDataFromPropertyFile("browser");
		userName=fileUtility.getDataFromPropertyFile("username");
		System.out.println(userName);
		password=fileUtility.getDataFromPropertyFile("password");
		String url=fileUtility.getDataFromPropertyFile("url");
		System.out.println(url);
		String timeouts=fileUtility.getDataFromPropertyFile("timeouts");
		longTimeouts=(long)JavaUtility.covertAnyDataType(timeouts, DataType.LONG);
		randomNumber = javaUtility.getRandomNumber(100);

		driver=webDriverUtility.openBrowserWithApplication(browser, longTimeouts, url);
		sdriver=driver;
		webDriverUtility.jsIntiallization(driver);
		webDriverUtility.intiallizeAction(driver);

		loginPage=new LoginPage(driver);
		commonPage=new CommonPage(driver);

 	}
	@BeforeMethod
	public void methodSetup1() {
		loginPage.loginAction(userName, password);	
	}
	@AfterMethod
	public void methodTearDown() throws IOException {
		commonPage.signoutAction(webDriverUtility, driver);
		//excelUtility.saveDataIntoExcel(IConstant.EXCE_PATH);
	}
	@AfterClass
	public void classTearDown() throws IOException {
		webDriverUtility.closeBrowser(driver);
		//excelUtility.closeExcel();
	}
}
