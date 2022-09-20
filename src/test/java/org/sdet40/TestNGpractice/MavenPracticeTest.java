package org.sdet40.TestNGpractice;

import org.generic.WebDriverUtility;
import org.testng.annotations.Test;

public class MavenPracticeTest {
	@Test
	public void step1Test() {
		String browser=System.getProperty("b");
		String url=System.getProperty("u");
		System.out.println("Browser name is--->>"+browser);
		System.out.println("URL is--->>"+ url);
		WebDriverUtility WebDriverUtility = new WebDriverUtility();
	WebDriverUtility.openBrowserWithApplication(browser, 101, url);
	}

}
