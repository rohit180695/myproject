package org.sdet40.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRM_TC_System {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();

	}

}
