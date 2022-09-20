package org.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.Validate;

public class FileUtility {
	Properties pro;
	public String getDataFromPropertyFile(String key) {
		  return pro.getProperty(key).trim();
	}
	public void initializaPropertyFile(String filePath) throws IOException {
	FileInputStream file =new FileInputStream(filePath);
	pro = new Properties();
	pro.load(file);
	}
}
