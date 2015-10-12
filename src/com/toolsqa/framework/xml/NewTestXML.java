package com.toolsqa.framework.xml;

import java.io.IOException;

import org.custommonkey.xmlunit.XMLAssert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

public class NewTestXML {
  @Test

	  
	 
			    public void AssertStringEqualAndIdenticalToSelf() 
			    {
			        String control = "<assert>true</assert>";
			        String test = "<assert>true</assert>";
		
			        try {
						XMLAssert.assertXMLEqual(control, test);
					} catch (SAXException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    }
  }

