import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class A002_Makemytrip {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.makemytrip.com/");
		
		driver.findElement(By.className("commonModal__close")).click();
		
		
		String myDate = "20";
		String myMonth = "January";
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]/div")).getText().contains(myMonth))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Week']/div/div/p"));
		for(WebElement date : dates)
		{
			if(date.getText().equals(myDate))
			{
				date.click();
				break;
			}
		}
		
	}
}
