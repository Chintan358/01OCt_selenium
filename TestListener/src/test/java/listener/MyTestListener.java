package listener;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utill.ScreenShot;

public class MyTestListener implements ITestListener {
		
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	
		WebDriver driver =(WebDriver)result.getTestContext().getAttribute("driver");
		String path = "C:\\Chintan_work\\Files\\"+result.getName()+".png";
		ScreenShot.getScreenShot(driver, path);
		
	}
}
