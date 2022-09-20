package org.generic;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	Connection connection;
	WebDriver driver;

	public WebDriver openBrowser(String browser) {
		WebDriver driver = null;

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		}
		return driver;
	}

	public void MaximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void waitTillPageLoad(WebDriver driver, long timeouts) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
	}

	public void navigateApplication(WebDriver driver, String url) {
		driver.get(url);
	}

	public WebDriver openBrowserWithApplication(String browser, long timeouts, String url) {

		driver = openBrowser(browser);
		MaximizeBrowser(driver);
		waitTillPageLoad(driver, timeouts);
		navigateApplication(driver, url);
		return driver;
	}

	public void mouseHoverAction(WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}

	public void doubleClick(WebDriver driver, WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	public void doubleClick(WebDriver driver) {
		new Actions(driver).doubleClick().perform();
	}

	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	public void closeDB() throws SQLException {

		connection.close();
	}

	private JavascriptExecutor jsExecutor;

	public void jsIntiallization(WebDriver driver) {
		jsExecutor = (JavascriptExecutor) driver;
	}

	public void openApplicationUsingJS(String url) {
		jsExecutor.executeScript("window.location=argument[0]", url);
	}

	public void sendKeysUsingJS(WebElement element, String data) {
		jsExecutor.executeScript("argument[0].value=arguments[1]", element, data);
	}

	public void clickUsingJS(WebElement element) {
		jsExecutor.executeScript("argument[0].click()", element);
	}

	public void scrollTillElementUsingJS(WebElement element) {
		jsExecutor.executeScript("argument[0].scrollIntoview()", element);
	}

	public WebElement convertDynamicXpathIntoWebElement(String dynamicXpath, String replaceData, WebDriver driver) {
		// jsExecutor.executeScript(dynamicXpath, replaceData);
		String requiredXpath = String.format(dynamicXpath, replaceData);
		WebElement element = driver.findElement(By.xpath(requiredXpath));
		return element;
	}

	public By convertDynamicXpathIntoByClass(String dynamicXpath, String replaceData, WebDriver driver) {
		String requiredXpath = String.format(dynamicXpath, replaceData);
		By element = By.xpath(requiredXpath);

		return element;

	}

	private Actions action;

	public void intiallizeAction(WebDriver driver) {
		action = new Actions(driver);
	}

	public void maximizeBrowser(WebElement element, WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void verifyWebpage(WebElement element, WebDriver driver, long longTimeout, String expectedText) {
		for (;;) {
			try {
				Assert.assertEquals(element.getText(), expectedText);
				break;
			} catch (Exception e) {
				waitTillElement(driver, longTimeout, element);
			}
		}
	}

	private void waitTillElement(WebDriver driver, long longTimeout, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(longTimeout));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void verfyREsult(String actualLastName, String expectedLeadLastName) {
		Assert.assertEquals(actualLastName, expectedLeadLastName);
	}

	public void veryfyResult(boolean condition) {
		Assert.assertTrue(condition);
	}

	public void screenshot(WebDriver driver, JavaUtility javaUtility, String className) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String currentTime = javaUtility.currentTime();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/" + className + "_" + currentTime + ".png");
		FileUtils.copyFile(src, dst);
	}
}
