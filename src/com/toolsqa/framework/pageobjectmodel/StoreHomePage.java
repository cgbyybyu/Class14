package com.toolsqa.framework.pageobjectmodel;

import org.openqa.selenium.WebDriver;

import com.toolsqa.framework.GlobalConstants;

public class StoreHomePage extends PageBase{

	StoreHomePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void verifyPage() {
		if(!driver.getTitle().contains(GlobalConstants.HOME_PAGE_TITLE))
			throw new IllegalStateException();
	}

		
}
