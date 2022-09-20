package org.sdet40.TestNGpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPracticeTest {
	@Test(groups="regression",retryAnalyzer=org.generic.RetryImplementation.class)
	public void step1Test() {
		Assert.fail();
		System.out.println("test1");
	}
	@Test(groups= {"sanity","regression"})
	public void step2Test() {
		Assert.fail();
		System.out.println("rohit--->test2");
	}

}
