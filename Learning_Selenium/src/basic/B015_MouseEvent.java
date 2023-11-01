package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utill.DriverConnection;

public class B015_MouseEvent {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/drag_drop.html");

				
		WebElement from  = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]"));
		
		WebElement to = driver.findElement(By.id("bank"));
		
		Actions builder = new Actions(driver);
		//builder.dragAndDrop(from, to).build().perform();
		//builder.clickAndHold(from).moveToElement(to).release().build().perform();
	}
}
