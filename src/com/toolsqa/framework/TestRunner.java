package com.toolsqa.framework;


import java.util.ArrayList;

import com.toolsqa.framework.dataaccess.TextFileReader;
import com.toolsqa.framework.logger.Logger;
import com.toolsqa.framework.tests.LoginTestUsingFramework;

public class TestRunner {
	
	
	public static void main(String[] args) {

		ArrayList<ITestCase> testCases = new ArrayList<>();
				
		testCases.add(new LoginTestUsingFramework());
		//testCases.add(new LoginTestUsingFramework());
		
		/* testCases.add(new LoginTestUsingFramework());
		testCases.add(new LoginTestUsingFramework());
		testCases.add(new LoginTestUsingFramework());
		testCases.add(new LoginTestUsingFramework());
		*/
		
		// Read All Browsers List from File
		ArrayList<String> allBrowsers = TextFileReader.getTextFileData(
				GlobalConstants.BROWSER_LIST_FILE_PATH);
		
		for(String browser  : allBrowsers)
		{
		GlobalConstants.currentBrowserToRunWith = browser;
		
		for(ITestCase tc : testCases){
			Logger.logTestStart("Starting Test Case");
			tc.setup();
			
			
			try
			{
				tc.run();
				Logger.logTestEnd("Test Ended", true);
			}
			catch(Exception e)
			{
				Logger.logTestEnd("Test Ended", false);
			}
			finally
			{
				tc.cleanup();
			}
		}
		}
		//driver.quit();
	}
}
