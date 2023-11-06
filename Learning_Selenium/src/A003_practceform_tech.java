import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utill.DriverConnection;

public class A003_practceform_tech {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/selenium-practice-form.html");
		
		
			WebElement cont = driver.findElement(By.id("continents"));
			Select conts = new Select(cont);
			conts.selectByVisibleText("Africa");
			
			
			WebElement command = driver.findElement(By.id("selenium_commands"));
			Select commands = new Select(command);
			commands.selectByVisibleText("Switch Commands");
			commands.selectByVisibleText("WebElement Commands");
			
			driver.findElement(By.linkText("Click here to Download File")).click();
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.navigate().back();
			//driver.navigate().forward();
			//driver.navigate().refresh();
	}
}
