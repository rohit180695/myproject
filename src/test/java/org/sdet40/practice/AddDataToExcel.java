package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AddDataToExcel {

	public static void main(String[] args) throws IOException {
        FileInputStream fisExcel=new FileInputStream("./src/test/resources/CommonData.xlsx");
        
		Workbook wb=WorkbookFactory.create(fisExcel);
        Sheet sheet = wb.getSheet("sheet1");
        Row row = sheet.getRow(6);
        Cell cell = row.createCell(4);
        cell.setCellValue("Skip");
        FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonData.xlsx");
       wb.write(fos);
        System.out.println("Data updated successfully");
        wb.close();
        

	}

}
