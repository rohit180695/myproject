package org.generic;

public class TestingGenericUtility {

	public static void main(String[] args) throws Throwable {
		ExcelUtility ecxeExcelUtility = new ExcelUtility();
		ecxeExcelUtility.intilaizeExcel(IConstant.EXCE_PATH);
		String data=ecxeExcelUtility.getDataFromExcel("Book1",1,1);
		System.out.println(data);
		
		new FileUtility().initializaPropertyFile(IConstant.PROPERTY_FILE_PATH);
		String browser=new FileUtility().getDataFromPropertyFile("browser");
		
		int randomNumber=new JavaUtility().getRandomNumber(1000);
		System.out.println(randomNumber);
		
		long res=(long)new JavaUtility().convertToDataType("10", DataType.LONG);
		System.out.println(res);		
	}

}
