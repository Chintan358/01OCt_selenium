package test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import com.Base;

public class ESPO extends Base {
	public static void main(String[] args) {
		
		
		
		driver = driverSetUp();
		driver.get("https://espo-hub.softwarecompanyindia.com/discover/events");
		
	}
}
