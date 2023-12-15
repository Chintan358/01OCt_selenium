package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class FbTest {
	
		@Test
		public void titleCheck(ITestContext i)
		{
			WebDriver driver = DriverConnection.connect("https://www.fb.com");
			i.setAttribute("driver", driver);
			assertEquals("fb", driver.getTitle());
		}
		
		@Test
		public void login(ITestContext i)
		{
			WebDriver driver = DriverConnection.connect("https://www.fb.com");
			driver.findElement(By.id("email")).sendKeys("test@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("test");
			driver.findElement(By.name("login")).click();
			i.setAttribute("driver", driver);
			assertEquals("fb-eeror", driver.getTitle());
			
		}
	
}
