package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utill.DriverConnection;

public class B010_PopupHandling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert =  driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
//		driver.findElement(By.id("timerAlertButton")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert =  driver.switchTo().alert();
//		alert.accept();
		
		
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alert =  driver.switchTo().alert();
//		alert.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert =  driver.switchTo().alert();
		alert.sendKeys("Hello");
		alert.accept();
		
	}
}
