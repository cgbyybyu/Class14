package com.toolsqa.framework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.toolsqa.framework.GlobalConstants;
import com.toolsqa.framework.logger.Logger;
import com.toolsqa.framework.pageobjectmodel.StoreLoggedInPage;
import com.toolsqa.framework.pageobjectmodel.StoreLoginPage;

public class TestNG_001 extends TestNGBase {
	
  @Test(enabled=true)
  public static void testRun1(){
	  
	  StoreLoginPage loginPage = new StoreLoginPage();
		Logger.logInfo("Open Login Page");
		loginPage.verifyPage();
		Logger.logInfo("Verify LoginPage");
		
		loginPage.setUserName(GlobalConstants.VALID_USERNAME);
		Logger.logInfo("Entered Username");
		
		loginPage.setPassword(GlobalConstants.VALID_PASSWORD);
		Logger.logInfo("Entered Password");
		
		StoreLoggedInPage loggedInPage = loginPage.clickLoginButton();
		Logger.logInfo(loggedInPage.toString());
		Logger.logInfo("Clicked Login Button");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	//  System.out.println("TestNG_001 RUN");
	  //throw new IllegalStateException();// driver.findElement
	  // Test Code that uses Framework Lib
	  
  }
  
   
  //@Test
   //public void testRun2(){
	 // System.out.println("TestNG_001 RUN");
	  //throw new IllegalStateException();// driver.findElement
	  // Test Code that uses Framework Lib
  }
  
}
