package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class Dynamic {
	
	@Test
	public static void test() {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/webtables");
		
	
		String uname = "Cierra";
		
		try {
			WebElement name = driver.findElement(By.xpath("//*[text()='"+uname+"']"));
			
			if(name.isDisplayed())
			{
				driver.findElement(By.xpath("//*[text()='"+uname+"']/following-sibling::div[6]/div/span[1]")).click();
			}
			
		} catch (Exception e) {
			System.out.println("element not found");
		}
		
		
	}
}
