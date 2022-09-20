package org.sdet40.TestNGpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	@Test(priority=2)
	public void createUser() {
		Reporter.log("class1--> script1", true);
	}
	@Test(priority=1)
	public void createUser1() {
		Reporter.log("class2--> script2", true);
	}

}
