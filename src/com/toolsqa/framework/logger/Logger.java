package com.toolsqa.framework.logger;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Logger {

	private static String getCurrentTimeStamp()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return "["+dateFormat.format(date)+"]"; //2015/02/14 15:59:48
	}
	
	public static void logFail(String message) {
		System.out.println(getCurrentTimeStamp()+" FAIL: " + message);
	
	}

	public static void logPass(String message) {
		System.out.println(getCurrentTimeStamp()+" PASS :" + message);
	}

	public static void logInfo(String message) {
		System.out.println(getCurrentTimeStamp()+" INFO: " + message);
	}

	public static void logTestStart(String message) {
		System.out.println();
		System.out.println(getCurrentTimeStamp()+" STARTED: " + message);
	}
	
	public static void logTestEnd(String message, boolean hasPassed) {
		if(hasPassed)
			System.out.println(getCurrentTimeStamp()+" PASSED_ENDED: " + message);
		else
			System.out.println(getCurrentTimeStamp()+" FAILED_ENDED: " + message);
		System.out.println();
	}
	
	
	public static void logException(Exception e, WebDriver driver)
	{
		// Take Screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Sandy\\Desktop\\Screenshot.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Capture Source of the page
		System.out.println("=============================");
		System.out.println(driver.getPageSource());
		System.out.println("=============================");
		
		// Capture
		System.out.println("URL:" + driver.getCurrentUrl());
		System.out.println("TITLE :" +driver.getTitle());
		
		// Inform the TestRunner
		//throw e;
	}
	
}
