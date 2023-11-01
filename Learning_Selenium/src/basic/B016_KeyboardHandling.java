package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utill.DriverConnection;

public class B016_KeyboardHandling {
	public static void main(String[] args) {
		
		
		WebDriver driver= DriverConnection.connect("https://www.google.com/");
		
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		
		builder.click(search)
				.sendKeys("tops technologies")
				.pause(Duration.ofSeconds(10))
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
	}
}
