package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		Properties property=new Properties();
		property.load(fis);
		String url= property.getProperty("url").trim();
		String browser = property.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);
	}
}
