package com.toolsqa.framework;

import com.toolsqa.framework.logger.Logger;

public abstract class AbstractTestCaseBase implements ITestCase {

	@Override
	public void setup() {
		Logger.logInfo("Inside Test Setup");
		// Launching Browser
		
		GlobalConstants.currentDriver = GlobalConstants.getWebDriver(
				GlobalConstants.currentBrowserToRunWith);
	}

	@Override
	public abstract void run();
	
	@Override
	public void cleanup() {
		// Close Browser
		Logger.logInfo("Inside Test Cleanup");
		GlobalConstants.currentDriver.quit();	
	}
}
