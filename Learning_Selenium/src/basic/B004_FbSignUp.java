package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B004_FbSignUp {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("9885748596");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("7");
		//days.selectByIndex(3);
		//days.selectByValue("4");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("2020");
	    
		List<WebElement> gender = driver.findElements(By.name("sex"));
		//System.out.println(gender.size());
		gender.get(1).click();
		
	}
}
