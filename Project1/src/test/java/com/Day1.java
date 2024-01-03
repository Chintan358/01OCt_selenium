package com;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;

public class Day1 extends Base{
	
	@Test
	public void loginCheck()
	{
		driver = driverSetUp();
		LoginPage log = new LoginPage(driver);
		log.username("mngr546405");
		log.password("sanEpYv");
		log.loginBtn();
		
		HomePage home = new HomePage(driver);
		//String title = home.getPageHeading();
		String actualTilte = home.getPageTitle();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		//assertTrue(title.equals("Manger Id : mngr546405"));
		assertEquals(expectedTitle, actualTilte);
	}
}
