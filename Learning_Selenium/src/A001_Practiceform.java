import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utill.DriverConnection;

public class A001_Practiceform {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		String myDate = "28";
		String myYear="2021";
		String myMonth="March";
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9896857485");
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
		for(WebElement date : dates)
		{
			if(date.getText().equals(myDate))
			{
				if(date.getAttribute("aria-label").contains(myMonth))
				{
				date.click();
				break;
				}
			}
		}
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		builder.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\pc\\Downloads\\img\\bat.jpg");
		
		driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat");
	}
}
