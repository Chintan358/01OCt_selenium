package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class Datadriven {

	WebDriver driver =null;
	@BeforeClass
	public void setup()
	{
		 driver = DriverConnection.connect("https://www.fb.com");
	}
	
	@Test(dataProvider = "dp")
	public void login(String uname, String pass) {
		
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(uname);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		//driver.findElement(By.name("submit")).click();
	}

	@DataProvider(name = "dp")
	public Object[][] getData() {

		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\test.xlsx", "test");
		int rows = rd.rowCount();
		int cols = rd.colCount();
		System.out.println(rows+" "+cols);
		Object[][] obj = new Object[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				String data = rd.getData(i, j);
				obj[i][j] = data;
			}
		}

		return obj;

	}
}
