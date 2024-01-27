package com;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Day1Listener implements ITestListener {
	
	Base base = new Base();
	@Override
	public void onTestFailure(ITestResult result) {
		 
		//WebDriver driver =(WebDriver)result.getTestContext().getAttribute("driver");
		base.getScreenShot(result.getName());
		
	}
}
