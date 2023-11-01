package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utill.DriverConnection;

public class B014_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		 WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		 
		 driver.switchTo().frame(frame);
		 
		 WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		 WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		 WebElement img3 = driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
		 WebElement img4 = driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));
			 
		 
		 WebElement trash = driver.findElement(By.id("trash"));
		
		
		 Actions builder = new Actions(driver);
		 
		 //builder.dragAndDrop(img1, trash).build().perform();
		 
		 Action e1 =  builder.clickAndHold(img1).moveToElement(trash).release().build();
		 Action e2 =  builder.clickAndHold(img2).moveToElement(trash).release().build();
		 Action e3 =  builder.clickAndHold(img3).moveToElement(trash).release().build();
		 Action e4 =  builder.clickAndHold(img4).moveToElement(trash).release().build();
		 
		 e1.perform();
		 Thread.sleep(2000);
		 e2.perform();
		 Thread.sleep(2000);
		 e3.perform();
		 Thread.sleep(2000);
		 e4.perform();
		 Thread.sleep(2000);
		 
		 
	}
}
