package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class propertiesFile {
	
	static File file = new File ("./Resources/config.properties");
	static FileInputStream fis= null;
	static Properties prop = new Properties();
	
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	

	static {
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setExtent () {
		extent = new ExtentReports("./Reports/extentreport.html");
	}
	
	public static void endReport() {
		extent.flush();
		extent.close();
	}


	public String getProperty(String key) {
		return prop.getProperty(key);
	}



}
