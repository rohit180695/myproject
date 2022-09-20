package org.sdet40.practice;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClenderPopup1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
		driver.findElement(By.id("datapicker")).click();
		String data =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		String requiredDate="20";
		String requiredMonth="January";
		String requiredYear="2024";
		
		int requiredMonthInNum=DateTimeFormatter.ofPattern("MMM").withLocale(Locale.ENGLISH).parse(requiredMonth).get(ChronoField.MONTH_OF_YEAR);
		
		int requiredYearInNum=Integer.parseInt(requiredYear);
		
		System.out.println();

	}
	

}
