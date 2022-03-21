package com.Base;



import java.net.URL;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseTest {
	
	private static final Logger log = Logger.getLogger(BaseTest.class); 
	String destDir;
	DateFormat dateFormat;
	
	public AppiumDriver<MobileElement>wd;
	static AppiumDriverLocalService service;
	public static propertiesFile prop = new propertiesFile();
	
	
	
	
	@BeforeSuite
	public void startAppium() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	
	
	@BeforeTest
	public void setUp()  {
		//DOMConfigurator.configure(System.getProperty("user.dir")+File.separator + "log4j.xml");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformVersion",prop.getProperty("platform.version"));
		capabilities.setCapability("platformName",prop.getProperty("platform.name"));
		capabilities.setCapability("appPackage",prop.getProperty("package.name"));
		log.info("app package is io.appium.android.apis");
		capabilities.setCapability("appActivity",prop.getProperty("application.activity"));
		capabilities.setCapability("app",prop.getProperty("appliction.path"));
		capabilities.setCapability("deviceName",prop.getProperty("device.name"));
		
		
		try {
			wd=new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		catch(Exception e) {
		  e.printStackTrace();	
		}

	}
	

	
	@Test
	public void apiDemos() {
		
		//wd.findElementByXPath("//android.widget.TextView[@content-desc=\"App\"]").click();
		//wd.findElementByXPath("//android.widget.TextView[@content-desc=\"Alarm\"]").click();
		//wd.findElementByXPath("//android.widget.TextView[@content-desc=\"Alarm Service\"]").click();
		//wd.findElementByXPath("//android.widget.TextView[@content-desc=\"Animation\"]").click();
		//wd.findElementByXPath("//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]").click();
		//wd.findElementById("io.appium.android.apis:id/hideGoneCB").click();
		//wd.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]").click();
		//wd.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]").click();
		//wd.findElementById("io.appium.android.apis:id/addNewButton").click();
		wd.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		
		
		//wd.findElementByXPath("//android.widget.TextView[@content-desc=\"Visibility\"]").click();
		//takeScreenShot();
	}
	
	
	
	
	



	@AfterTest
	public void stopAppium() {
		wd.quit();
	}
	
	@AfterSuite
	public void closeAppium() {
		service.stop();
	}
}
