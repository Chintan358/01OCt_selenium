package com;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class ParameterDemo_Multi {
	
	
	@Test(dataProvider = "dp")
	public void login(String uname, String pass)
	{
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}
	
	@DataProvider(name="dp")
	public static Object[][] getData()
	{
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test";
		
		
		obj[1][0] = "demo@gmial.com";
		obj[1][1] = "demo";
		
		obj[2][0] = "tech@gmail.com";
		obj[2][1] = "tech";
		
		obj[3][0] = "abc@gmail.com";
		obj[3][1] = "abc";
		
		return obj;
		
	}
	
	
	
}
