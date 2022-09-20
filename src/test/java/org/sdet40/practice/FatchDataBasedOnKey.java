package org.sdet40.practice;

import org.generic.ExcelUtility;

public class FatchDataBasedOnKey {

	public static void main(String[] args) {
		ExcelUtility excelUtility = new ExcelUtility();
		String firstname=excelUtility.getDataFromExcel("form", "firstName");
		String lastname=excelUtility.getDataFromExcel("form", "lastname");
		String email=excelUtility.getDataFromExcel("form", "email");
		String address=excelUtility.getDataFromExcel("form", "address");
		System.out.println(firstname);
	}

}
