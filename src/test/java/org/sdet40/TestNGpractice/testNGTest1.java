package org.sdet40.TestNGpractice;

import org.testng.annotations.Test;

public class testNGTest1 {
	@Test(priority=1)
	public void testCase1() {
		System.out.println("test1");
	}
	@Test(priority=2)
	public void testCase2() {
		System.out.println("test2");
		
	}
	

}
