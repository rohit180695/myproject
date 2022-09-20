package org.sdet40.practice;

import java.io.IOException;

import org.generic.BaseClass;
import org.generic.DataType;
import org.generic.ExcelUtility;
import org.generic.FileUtility;
import org.generic.IConstant;
import org.generic.JavaUtility;
import org.generic.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

public class CRM_TC_LeadM extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		WebDriverUtility WebDriverUtility=new WebDriverUtility();
		FileUtility fu=new FileUtility();
		ExcelUtility Eu=new ExcelUtility();
		JavaUtility Ju=new JavaUtility();
		fu.initializaPropertyFile(IConstant.PROPERTY_FILE_PATH);
		String url=fu.getDataFromPropertyFile("url");
		String username=fu.getDataFromPropertyFile("username");
		String password=fu.getDataFromPropertyFile("password");
		String browser=fu.getDataFromPropertyFile("browser");
		String timeout=fu.getDataFromPropertyFile("timeout");
		long timeouts=(long)JavaUtility.covertAnyDataType(timeout,DataType.LONG);
		WebDriver driver=null;
//		WebDriverUtility.openBrowserWithApplication(browser,  timeout, url);
//		
//		driver.findElement(By.name("user_name")).sendKeys(username,Keys.TAB);
//		driver.findElement(By.name("user_password")).sendKeys(password,Keys.ENTER);
		Actions action=new Actions(driver);
//		WebElement morelink = driver.findElement(By.xpath(By.xpath("//a[@text()='Leads']")).click();
		//action.moveToElement(morelink).build().perform();
		//driver.findElement(By.name("Lead")).click();
		//driver.findElement(By.xpath().click();
		
	}

}
