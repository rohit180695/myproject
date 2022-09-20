package org.sdet40.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRM_Delete_Operation {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8888");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("user_password")).sendKeys("root", Keys.ENTER);
		String ComName ="demovtiger";
		driver.findElement(By.xpath("//a[text()='Organization']")).click();
	   List<WebElement> ele= (List<WebElement>) driver.
				findElement(By.xpath("//table[@class='lvt small']/tbody/tr/td/a[@title='Organization']"));
        for(WebElement org:ele) {
        	String orgName=org.getText();
			if(orgName.equals(ComName)) {
				driver.findElement(By.xpath("//a[text()='demovtiger']/parent::tb/preceding-sibling::tb/input")).click();
				break;
			
			}
        }
      driver.findElement(By.xpath("//input[@class='crmbutton small delet']")).click();
      driver.switchTo().alert().accept();
	}
}
