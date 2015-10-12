package com.toolsqa.framework.tests;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toolsqa.framework.logger.Logger;

public class TestNG_002 extends TestNGBase{
	
	@Test
	public void run()
	{
		try
		{
		System.out.println("TestNG_002 RUN");
		
		}
		catch(Exception e)
		{
			Logger.logException(e, null);// Take Screenshot
		}
	}
	

}
