package org.sdet40.TestNGpractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionPractice {
	@Test
	public void test1() {
		String actual="HiiHello";
		String expected="hi";
		Reporter.log("test1", true);
		Assert.assertEquals(actual, expected);
		Reporter.log("test11", true);
		Reporter.log(expected);
	}
	@Test
	public void test2() {
		Reporter.log("test2", true);
	}

}
