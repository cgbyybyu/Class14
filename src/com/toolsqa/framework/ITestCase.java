package com.toolsqa.framework;

public interface ITestCase {

	void setup(); // Start Browser
	void cleanup(); // Close 
	void run();
}
