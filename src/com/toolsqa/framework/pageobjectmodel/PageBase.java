package com.toolsqa.framework.pageobjectmodel;

import org.openqa.selenium.WebDriver;

public abstract class PageBase {

	protected WebDriver driver;
	protected WebPageHeader pageHeader;
	
	
	PageBase(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public abstract void verifyPage();
}
