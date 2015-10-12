package com.toolsqa.framework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class GlobalConstants {

	public static final int ELEMENT_LOCATING_DEFAULT_TIMEOUT = 10;//default value of 10sec
	
	public static final String VALID_USERNAME = "10janbatch_test1";
	public static final String VALID_PASSWORD = "18NYVIZMI52f";
	
	
	public static final String MESSAGE_FILE = "it-it_Messages.txt";
	
	public static final String HOME_PAGE_URL = "http://store.demoqa.com";
	public static final String LOGIN_PAGE = "http://store.demoqa.com/products-page/your-account";
	public static final String GOOGLE_PAGE = "https://www.google.ca/";
	
	
	public static final String HOME_PAGE_TITLE= "ONLINE STORE";
	public static final String LOGIN_PAGE_TITLE= "Your Account";
	public static final String BROWSER_LIST_FILE_PATH = "C:\\Users\\User\\Desktop\\BrowserSelectionFile.txt";
	public static WebDriver currentDriver  = null;
	public static String currentBrowserToRunWith;
	
	public static final String GOOGLE_HOMEPAGE_SERCH_BOX = "lst-ib";
	public static final String GOOGLE_SERCHPAGE_WEB_BUTTON = "hdtb-msb";
	public static final String GOOGLE_SEARCH_BUTTON = "btnG";
	public static final String GOOGLE_QUERRYTEXT = "selenium webdriver online training course";
	public static String GOOGLE_SEARCH_RESULT;
	public static final String EXCEL_RESULT_FILEPATH = "C:\\Users\\User\\Desktop\\data.xlsx";
	
	// LoginErrorMessage=Invalid UserName
	// LoginErrorMessage=Invlid UsN
	
	
	public static WebDriver getWebDriver(String browser)
	{
		if(browser.equalsIgnoreCase("ie"))
			return new InternetExplorerDriver();
		if(browser.equalsIgnoreCase("ie_toolsqa_startup"))
		{
			DesiredCapabilities capabilities =  new DesiredCapabilities();
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,
					"http://toolsqa.com");
			
			return new InternetExplorerDriver(capabilities);
		}
		else if(browser.equalsIgnoreCase("chrome"))
			return new ChromeDriver();
		else if(browser.equalsIgnoreCase("htmlUnit"))
			return new HtmlUnitDriver();
		return new FirefoxDriver();
	}
	
	public static void waiterById (String id)
	{
		FluentWait<WebDriver> waiter = new FluentWait<WebDriver>(GlobalConstants.currentDriver);
		waiter.withTimeout(20, TimeUnit.SECONDS);
		waiter.pollingEvery(1, TimeUnit.SECONDS);
	    waiter.ignoring(NoSuchElementException.class);
			
		waiter.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	
	
}
