package com.toolsqa.framework.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.toolsqa.framework.GlobalConstants;

public class StoreLoginPage extends PageBase{
	
	public StoreLoginPage() {
		this(GlobalConstants.currentDriver);
	}
	
	
	StoreLoginPage(WebDriver driver) {
		super(driver);
		driver.get(GlobalConstants.LOGIN_PAGE);
	}


	public void setUserName(String username)
	{
		// Find UserName TextBox
		//Enter Text Into It
		driver.findElement(By.id("log")).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(By.id("pwd")).sendKeys(password);
	}
	
	public StoreLoggedInPage clickLoginButton()
	{
		/* Tomorrow's Class*/
		
		
		driver.findElement(By.id("login")).click();
		StoreLoggedInPage slip = new StoreLoggedInPage(GlobalConstants.currentDriver);
		return slip;
	}
	
	public void setStateOfRememberMe(boolean check)
	{
		
	}
	
	public boolean getStateOfRememberMe()
	{
		// TODO:  Fill in the code
		return false;
	}

	@Override
	public void verifyPage() {
		if(!driver.getTitle().contains(GlobalConstants.LOGIN_PAGE_TITLE))
			throw new IllegalStateException();
	}
	
	
	public boolean login(String username, String password)
	{
		return true;
	}
	
}
