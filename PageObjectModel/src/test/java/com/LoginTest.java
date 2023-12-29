package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import repo.LoginFactory;
import repo.LoginObject;
import utill.DriverConnection;

public class LoginTest {
	
	@Test
	public void myTest()
	{
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		
		
		Properties prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Chintan_work\\java\\01oct_selenium\\PageObjectModel\\src\\test\\resources\\data.propeties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//LoginObject login = new LoginObject(driver);
		LoginFactory login = new LoginFactory(driver);
		login.enterEmail(prop.getProperty("email"));
		login.enterPass(prop.getProperty("pass"));
		login.clickLogin();
		
	}
}
