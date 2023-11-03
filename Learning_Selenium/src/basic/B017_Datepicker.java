package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class B017_Datepicker {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		
		String myDate = "18";
		String myYear="2021";
		String myMonth="March";
		
		WebElement f = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div/p/iframe"));
		driver.switchTo().frame(f);
		
		driver.findElement(By.id("datepicker")).click();
		
		
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		int a = Integer.parseInt(currentYear);
		int b = Integer.parseInt(myYear);
		
		
		while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
		{
			if(b>a)
			{
				driver.findElement(By.xpath("//a[@title='Next']/span")).click();
				while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
				{
					driver.findElement(By.xpath("//a[@title='Next']/span")).click();
				}
			}
			else
			{
				driver.findElement(By.xpath("//a[@title='Prev']/span")).click();
				while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
				{
					driver.findElement(By.xpath("//a[@title='Prev']/span")).click();
				}
			}
		}
		
		
		
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date : dates)
		{
			if(date.getText().equals(myDate))
			{
				date.click();
			}
		}
		
		
	}
}
