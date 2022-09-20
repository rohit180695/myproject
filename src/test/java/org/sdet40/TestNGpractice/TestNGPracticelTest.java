package org.sdet40.TestNGpractice;

import java.lang.reflect.Method;

public class TestNGPracticelTest {
	public void step1Test(Method mtd) {
		System.out.println("Current Method name:-"+ mtd.getName());
		System.out.println("Current class name:-"+getClass().getSimpleName());
		
	}

}
