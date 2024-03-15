import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class Practice_souce {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		String product = "Sauce Labs Bolt T-Shirt";
		
		
		
		
		try {
			WebElement ele = driver.findElement(By.xpath("//*[text()='"+product+"']"));

			driver.findElement(By.xpath("//*[text()='"+product+"']/parent::a/parent::div/following-sibling::div/button")).click();
			driver.findElement(By.id("shopping_cart_container")).click();
			
			
		
				try {
					WebElement ele1 =   driver.findElement(By.xpath("//*[text()='"+product+"']"));
					if(ele1.isDisplayed())
					{
						System.out.println("Test case pass");
					}
					else
					{
						System.out.println("Fail");
					}
				} catch (Exception e) {
					System.out.println("Failed");
				}
			
			
		} catch (Exception e) {
			System.out.println("Product not found");
		}
		
		
		
		
		
		
	}
}
