package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_Titlecheck {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		String actualTime =  driver.getTitle();
		String expectedTitle = "facebook";
		
		if(actualTime.equals(expectedTitle))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	}
}
