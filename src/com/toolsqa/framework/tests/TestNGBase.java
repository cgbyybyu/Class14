package com.toolsqa.framework.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.toolsqa.framework.GlobalConstants;
import com.toolsqa.framework.logger.Logger;

public class TestNGBase {

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod ");
		  GlobalConstants.currentBrowserToRunWith = "chrome";
		  GlobalConstants.currentDriver = GlobalConstants.getWebDriver(
					GlobalConstants.currentBrowserToRunWith);
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
		  Logger.logInfo("Inside Test Cleanup");
			GlobalConstants.currentDriver.quit();	
		 
	  }
}
