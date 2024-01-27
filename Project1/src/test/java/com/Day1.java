package com;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;

public class Day1 extends Base{
	
	@Test(dataProvider = "dp")
	public void loginCheck(String uname, String pass, String expectedTitle, ITestContext i) throws InterruptedException
	{
		driver = driverSetUp();
		LoginPage log = new LoginPage(driver);
		log.username(uname);
		log.password(pass);
		log.loginBtn();
		
		
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		HomePage home = new HomePage(driver);
		//String title = home.getPageHeading();
		String actualTilte = home.getPageTitle();
		
		//assertTrue(title.equals("Manger Id : mngr546405"));
		//i.setAttribute("driver", driver);
		assertEquals(actualTilte, expectedTitle);
	}
	
	
	@DataProvider(name = "dp")
	public Object[][] getData()
	{
		Object  obj[][] = new Object[4][3];
		
		obj[0][0] = "mngr546405";
		obj[0][1] = "sanEpYv";
		obj[0][2] = "Guru99 Bank Manager HomePage";
		
		obj[1][0] = "mngr546405";
		obj[1][1] = "sanEpYvddd";
		obj[1][2] = "Guru99 Bank Home Page1";
		
		obj[2][0] = "gmngr546405dsd";
		obj[2][1] = "sanEpYv";
		obj[2][2] = "Guru99 Bank Home Page";
		
		obj[3][0] = "gmngr54640dsds5";
		obj[3][1] = "sanEpYvds";
		obj[3][2] = "Guru99 Bank Home Page";
		
		return obj;
	}
	
	
}
