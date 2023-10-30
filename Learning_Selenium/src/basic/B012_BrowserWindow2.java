package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utill.DriverConnection;

public class B012_BrowserWindow2 {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/browser-windows");
		
		String mainwin = driver.getWindowHandle();
		System.out.println("main win"+mainwin);
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> allWins = driver.getWindowHandles();
		for(String win : allWins)
		{
			System.out.println(win);
			if(!win.equals(mainwin))
			{
				//driver.switchTo().window(win);
			}
		}
		
		String data =  driver.findElement(By.xpath("/html/body/text()")).getText();
		System.out.println(data);
		
//		driver.close();
//		driver.switchTo().window(mainwin);
//		driver.close();
		
		driver.quit();
	}
}
