package org.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;
import com.mysql.cj.result.Row;

/**
 * 
 * @author rohit
 *
 */

public class ExcelUtility {
	private FileOutputStream fos;
	private Workbook wb;
	//private sheet sh;
	private FileInputStream fis;
	public void initilaizeExcel(String excelPath) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook Workbook = WorkbookFactory.create(fis);
	}
	public String getDataFromExcel(String sheetName , int rowNum, int celNum) throws Throwable {
		fis  = new FileInputStream("./src/test/resources/Book1.xlsx");	
		Sheet sh = wb.getSheet(sheetName);
		String data = sh.getRow(rowNum).getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}
	public void closeExcel() throws IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/Book1.xlsx");
		wb.close();
	}
	public int getRowCount(String sheetName,int rowNumber, int celNum ,String data) throws Throwable {
		fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		Sheet sh = wb.getSheet(sheetName);
		wb.close();
		return sh.getLastRowNum();
	}
	public void setDataExcel(String sheetName , int rowNum, int celNum ,String data) throws Throwable {		fis  = new FileInputStream("./src/test/resources/Book1.xlsx");
		Sheet sh = wb.getSheet(sheetName);
		fos = new FileOutputStream("./src/test/resources/Book1.xlsx");
		wb.write(fos);
		wb.close();
	}
	public void intilaizeExcel(String excelPath) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
	}
	public String getDataFromExcel(String sheetName, String requiredKey) {
		Sheet sheet = wb.getSheet(sheetName);
		String value=null;
		for(int i=0; i<=sheet.getLastRowNum();i++) {
			String actualKey=sheet.getRow(i).getCell(1).getStringCellValue();
			if(actualKey.equalsIgnoreCase(requiredKey)) {
				value=sheet.getRow(i).getCell(1).getStringCellValue();
			}
		}
		return value;
	}
	public Map<String, String> getDataFromExcelInMap(String sheetName, Workbook workbook) {

		Sheet sheet = workbook.getSheet(sheetName);
		Map<String, String> map=new HashMap<>();
		DataFormatter df=new DataFormatter();
		for(int i=0; i<=sheet.getLastRowNum();i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(i)));
		}
		return map;
	}
	public List<Map<String, String>> getDataFormExcelInList(String sheetName) {
		Sheet sheet = wb.getSheet(sheetName);
		List<Map<String, String>>list=new ArrayList<>();
		DataFormatter df=new DataFormatter();
		for(int k=1; k<sheet.getRow(0).getLastCellNum();k++) {
			Map<String, String> map=new HashMap<>();
			for(int i=0; i<=sheet.getLastRowNum();i++) {
				map.put(df.formatCellValue(sheet.getRow(1).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(1)));
			}
			list.add(map);
			System.out.println(list);
		}
		return list;
	}
	public String getDataFronExcel(String sheetName, String requiredKey, String testcaseName) {
		
		Sheet sh = wb.getSheet(sheetName);
		String value=null;
		for(int i=0; i<=sh.getLastRowNum(); i++) {
			String actualTestCaseName=sh.getRow(i).getCell(0).getStringCellValue();
			if(actualTestCaseName.equalsIgnoreCase(testcaseName)) {
				for(int j=1; j<sh.getRow(i).getLastCellNum(); j++) {
					String actualKey=sh.getRow(i).getCell(j).getStringCellValue();
					if(actualKey.equalsIgnoreCase(requiredKey))
						value=sh.getRow(i+1).getCell(j).getStringCellValue();
					break;
				}
				break;
			}
			return null;
		}
		return value;
	}
	public void saveDataIntoExcel(String excePath) throws IOException {
		fos=new FileOutputStream(IConstant.EXCE_PATH);
		wb.write(fos);
	}
	}
	
		
	

	

