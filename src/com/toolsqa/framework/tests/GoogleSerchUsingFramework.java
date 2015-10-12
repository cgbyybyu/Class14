package com.toolsqa.framework.tests;

import org.testng.annotations.Test;

import com.toolsqa.framework.GlobalConstants;
import com.toolsqa.framework.pageobjectmodel.GoogleSearchPage;
import com.toolsqa.framework.pageobjectmodel.SearchInPage;


public class GoogleSerchUsingFramework extends TestNGBase {
	
	@Test
	public static void grun(){
	
	GoogleSearchPage gsp = new GoogleSearchPage();
	gsp.searchFor(GlobalConstants.GOOGLE_QUERRYTEXT);
	
	SearchInPage sip = gsp.clickSearchbutton();
	sip.search(GlobalConstants.GOOGLE_QUERRYTEXT, 8);
	
	}
}
