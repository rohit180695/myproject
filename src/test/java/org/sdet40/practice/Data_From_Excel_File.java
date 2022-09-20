package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.generic.ExcelUtility;
import org.generic.IConstant;

import com.google.common.collect.Table.Cell;

public class Data_From_Excel_File {

	public static void main(String[] args) throws Throwable {
		ExcelUtility excelUtility=new ExcelUtility();
		excelUtility.intilaizeExcel(IConstant.EXCE_PATH);
		String url=excelUtility.getDataFromExcel("CommonData", 0, 1);
		String username=excelUtility.getDataFromExcel("CommonData", 1, 1);
		String password=excelUtility.getDataFromExcel("CommonData",2, 1);
//		FileInputStream file=new FileInputStream("src/test/resources/Book2.xlsx");
//		Workbook wb = WorkbookFactory.create(file);
//		String url=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		String username=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//		String password=wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		//Sheet sheet=wb.getSheet("CommonData");
	//	Row row=sheet.getRow(0);
	//Cell cell= row.getCell(0);
		System.out.println("URL " +url);
		System.out.println("UserName" + username);
		System.out.println("Password " +password);
			
	}

	
	
}
