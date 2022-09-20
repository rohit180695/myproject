package org.sdet40.practice;

import org.generic.DataType;
import org.generic.ExcelUtility;
import org.generic.FileUtility;
import org.generic.IConstant;
import org.generic.JavaUtility;
import org.generic.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.sdet40.ObjectRepository.CommonPage;
import org.sdet40.ObjectRepository.LeadInformationPage;
import org.sdet40.ObjectRepository.LoginPage;

public class CreatLeadsTest {

	public static void main(String[] args) throws Throwable {
		ExcelUtility excelUtility=new ExcelUtility();
		FileUtility fileUtility=new FileUtility();
		JavaUtility javaUtility=new JavaUtility();
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		fileUtility.initializaPropertyFile(IConstant.PROPERTY_FILE_PATH);
		excelUtility.initilaizeExcel(IConstant.EXCE_PATH);
		String browser=fileUtility.getDataFromPropertyFile("browser");
		String userName=fileUtility.getDataFromPropertyFile("username");
		String password=fileUtility.getDataFromPropertyFile("password");
		String url=fileUtility.getDataFromPropertyFile("url");
		String timeouts=fileUtility.getDataFromPropertyFile("timeouts");
		String expectedLeadLastName=excelUtility.getDataFromExcel("Book1", 2, 1);
		
//		long longTimeout=(long)javaUtility.covertAnyDataType(timeouts, DataType.LONG);
//		//WebDriver driver=webDriverUtility.openBrowserWithApplication(browser, timeouts, url);
//		LoginPage loginPage=new LoginPage(driver);
//		CommonPage commonPage=new CommonPage(driver);
//		LeadInformationPage leadInformationPage=new LeadInformationPage(driver);
//		
//		loginPage.loginAction(userName, password);
//		commonPage.clickLeadTab();
		
	}

}
