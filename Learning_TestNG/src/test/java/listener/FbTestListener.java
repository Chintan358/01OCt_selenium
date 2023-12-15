package listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utill.ScreenShot;

public class FbTestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		WebDriver driver =(WebDriver)result.getTestContext().getAttribute("driver");
		String path = "C:\\Chintan_work\\Files\\"+result.getName()+".png";
		ScreenShot.getScreenShot(driver, path);
	}
	
	
}
