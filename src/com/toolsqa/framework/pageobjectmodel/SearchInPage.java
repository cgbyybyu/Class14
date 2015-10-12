package com.toolsqa.framework.pageobjectmodel;

import java.util.List;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.toolsqa.framework.GlobalConstants;
import com.toolsqa.framework.dataaccess.ExcelReader;



public class SearchInPage extends PageBase
{
	
	SearchInPage(WebDriver driver)
	{
		super(driver);
		
	}
		
	

	public List<String> search(String querryText, int n)
	
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
	
		int k=0;
		for (int i=0; i<links.size(); i=i+1)
		    {
			
		    if (links.get(i).getText().contains("Selenium")&&k<n)
		   	    {	
		    	
		    	k=k+1;   	
		    	System.out.println(links.get(i).getText());
		        	
		        if (links.get(i).getAttribute("href").contains("toolsqa.com"))
		        	
		              { 
		        	System.out.println("Number:  " + k + "  "+ links.get(i).getAttribute("href"));
		        	GlobalConstants.GOOGLE_SEARCH_RESULT = "Pass";
		        	System.out.println("Test " + GlobalConstants.GOOGLE_SEARCH_RESULT);
		        	
		        	ExcelReader.setExcelData(GlobalConstants.EXCEL_RESULT_FILEPATH, "Sheet1", 0, 2, "serj1");
		        			
		        	String value2 = ExcelReader.getExcelData(GlobalConstants.EXCEL_RESULT_FILEPATH, "Sheet1", 0, 0);
		        	System.out.println(value2);
		        	String value1 = ExcelReader.getExcelData(GlobalConstants.EXCEL_RESULT_FILEPATH, "Sheet1", 0, 2);
		        	System.out.println(value1);
		            i=links.size();
		              }
		       
		        }
		         if (k==n)
		            {
		    	    System.out.println("test fail");
		    	    i=links.size();
		            }
		    }
		   
		    	    
		        
		    
	        
	        
	        
	
		
		return null;
	}	
	

	@Override
	public void verifyPage() {
		// TODO Auto-generated method stub
		
	}

}
