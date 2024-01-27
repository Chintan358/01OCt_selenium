package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class ESPO {
	public static void main(String[] args) {
		
		
		
		WebDriver driver = DriverConnection.connect("https://espo-hub.softwarecompanyindia.com/discover/events");
		WebElement element =  driver.findElement(By.xpath("//a[@href='/login']"));
		System.out.println(element.isDisplayed());
		element.click();
		
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
	}
}
