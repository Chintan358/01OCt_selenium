package com;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

@RunWith(Parameterized.class)
public class FBLogin {
	
	String username,password;
	
	
	
	public FBLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	static WebDriver driver;

	@BeforeClass
	public static void setUp()
	{
		 driver = DriverConnection.connect("https://www.fb.com");
	}

	@Test
	public void login()
	{
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		email.clear();
		email.sendKeys(username);
		pass.clear();
		pass.sendKeys(password);	
		
		driver.findElement(By.name("login")).click();
		
		driver.navigate().back();
	}
	
	@Parameters
	public static List<Object[]> getData()
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
		
		return Arrays.asList(obj);
		
	}
}
