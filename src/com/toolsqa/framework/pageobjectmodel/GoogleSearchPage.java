package com.toolsqa.framework.pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Global;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.toolsqa.framework.GlobalConstants;

public class GoogleSearchPage extends PageBase{
	
	
	public GoogleSearchPage(){
		this(GlobalConstants.currentDriver);
	}
	
	
	GoogleSearchPage(WebDriver driver) {
		super(driver);
		driver.get(GlobalConstants.GOOGLE_PAGE);
		GlobalConstants.waiterById (GlobalConstants.GOOGLE_HOMEPAGE_SERCH_BOX);
	}
	
	//WebElement searchBox;
	//WebElement btnSearch;
	//WebDriver driver;

		public void searchFor (String querry)
		{
			driver.get(GlobalConstants.GOOGLE_PAGE);
			driver.manage().window().maximize();
			GlobalConstants.waiterById (GlobalConstants.GOOGLE_HOMEPAGE_SERCH_BOX);
			driver.findElement(By.id(GlobalConstants.GOOGLE_HOMEPAGE_SERCH_BOX)).sendKeys(querry);
			
		}
		
		public  SearchInPage  clickSearchbutton()
		{
			driver.findElement(By.name(GlobalConstants.GOOGLE_SEARCH_BUTTON)).click();
			
			GlobalConstants.waiterById(GlobalConstants.GOOGLE_SERCHPAGE_WEB_BUTTON);
			
			SearchInPage sip = new SearchInPage(GlobalConstants.currentDriver);
			return sip;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		@Override
		public void verifyPage() {
			// TODO Auto-generated method stub
			
		}

	

}
