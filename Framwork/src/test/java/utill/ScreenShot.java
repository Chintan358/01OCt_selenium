package utill;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void getScreenShot(WebDriver driver, String path)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =  ts.getScreenshotAs(OutputType.FILE); 
		File dest = new File(path);
		
		try {
			Files.copy(source, dest);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
