package com.toolsqa.framework.tests;

import com.toolsqa.framework.AbstractTestCaseBase;
import com.toolsqa.framework.GlobalConstants;
import com.toolsqa.framework.logger.Logger;
import com.toolsqa.framework.pageobjectmodel.StoreLoggedInPage;
import com.toolsqa.framework.pageobjectmodel.StoreLoginPage;

public class LoginTestUsingFramework extends AbstractTestCaseBase{
	
	@Override
	public void run() {
				
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
		}
		
		//loginPage.login(GlobalConstants.VALID_USERNAME, GlobalConstants.VALID_PASSWORD);
	}

}
