package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.DriverConnection;

public class SilverS {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://dev.silversparrow.ca/sign-in");
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		
	}
}
