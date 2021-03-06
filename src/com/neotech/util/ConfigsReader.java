package com.neotech.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	private static Properties prop ; //to reach from other method in this class it should be local variable in class
	
	/**
	 * This Method will read the properties file
	 * @param filePath
	 */
	
	public static void readProperties(String filePath)  {
		
		try {
			
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * This method will return the value for a specific key
	 * 
	 * @param String key
	 * @return String value
	 */
	
	public static String getProperty(String key) {
		
		return prop.getProperty(key);
		
	}

}
