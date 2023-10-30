package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utill.DriverConnection;

public class B011_BrowserWindow {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/browser-windows");
		
		String mainwin = driver.getWindowHandle();
		//System.out.println("main win"+mainwin);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> allWins = driver.getWindowHandles();
		for(String win : allWins)
		{
			if(!win.equals(mainwin))
			{
				driver.switchTo().window(win);
			}
		}
		
		String data =  driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
//		driver.close();
//		driver.switchTo().window(mainwin);
//		driver.close();
		
		driver.quit();
	}
}
