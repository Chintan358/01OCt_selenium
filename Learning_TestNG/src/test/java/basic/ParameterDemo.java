package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class ParameterDemo {
	
	@Parameters({"username","password"})
	@Test
	public void login(String uname, String pass)
	{
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}
}
