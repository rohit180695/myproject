package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FactchMultipaldataFronExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    FileInputStream file=new FileInputStream("./src/test/resources/CommonData.xlsx");
	    Workbook wb=WorkbookFactory.create(file);
	    Sheet sheet = wb.getSheet("Sheet1");
	    DataFormatter df=new DataFormatter();
	    for(int i=0; i<=sheet.getLastRowNum();i++);{
	    	for(int j=0; j<=sheet.getRow(j).getLastCellNum();j++) {
	    		System.out.println(df.formatCellValue(sheet.getRow(j).getCell(j)));
	    	}
	    	System.out.println();
	    }

	}

}
