package com.toolsqa.framework.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_003 {
	
  @Test
  public void run1() {
	  System.out.println("TestNG_003 RUN1");
	  //throw new IllegalStateException();
	
  }
  
  @Test
  public void validateDiscountText() {
	  System.out.println("TestNG_003 RUN2");
	  String expectedString = "Discount";
	  
	  // Get WebElement
	  // we.getText()
	  
	  String actualString = "Discount";
	  
	  /*
	  if(!expectedString.equals(actualString))
		  throw new IllegalStateException("Test Failed");
		 */
	  
	  
	  Assert.assertEquals(actualString, expectedString);
	  
	  // What is Assert?
	  //       Class
	  
	  // assertEquals?
	  //   static Method
	  
	  // assertEquals is defined many times?
	  //  Polymorphism - Overloading
	  
	  
  }
  @Test
  public void run4() {
	  TestNG_001.testRun1();
  }
  
  
  @Test
  public void run3() {
	  System.out.println("TestNG_003 RUN3");
	  Reporter.log("This is log from my test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\n=====================");
	  System.out.println("TestNG_003 Setup");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("TestNG_003 Cleanup");
  }

}
