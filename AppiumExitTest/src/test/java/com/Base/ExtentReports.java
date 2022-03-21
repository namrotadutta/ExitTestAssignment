package com.Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports {
	
	 ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void reportSetUp() {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
		
	}
	

	private void attachReporter(ExtentHtmlReporter htmlReporter2) {
		// TODO Auto-generated method stub
		
	}


	@AfterSuite
	public void reportTearDown() {
		
		extent.flush();
	}


	private void flush() {
		// TODO Auto-generated method stub
		
	}

}
