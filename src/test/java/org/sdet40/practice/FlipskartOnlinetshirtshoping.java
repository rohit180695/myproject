package org.sdet40.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipskartOnlinetshirtshoping {

	public static void main(String[] args) {
		//WebDriveManager.chomedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(null);

	}

}
