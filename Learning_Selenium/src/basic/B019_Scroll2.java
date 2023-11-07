package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class B019_Scroll2 {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,100)");
		WebElement ele = driver.findElement(By.xpath("//*[text()='Great Indian Festival']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
}
