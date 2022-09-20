package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;

public class ExtractDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/CommonData.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		 DataFormatter df = new DataFormatter();
		 Sheet sheet = wb.getSheet("Sheet1");
		String value =null;
		for(int i=0;i<sheet.getLastRowNum(); i++) {
			String key =df.formatCellValue(sheet.getRow(7).getCell(0));
			if(key.equalsIgnoreCase("D")) {
				value=df.formatCellValue(sheet.getRow(7).getCell(1));
			}
		}
		System.out.println(value);
		

	}

}
