import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GeneralStore {
	public static void main(String[] args) {
		
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("mytest");
		option.setApp("C:\\Chintan_work\\java\\01oct_selenium\\Appium_Learning\\src\\test\\resources\\General-Store.apk");
		//option.setApp("C:\\Chintan_work\\java\\01oct_selenium\\Appium_Learning\\src\\test\\resources\\spending-tracker-2-7.apk");
		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),option);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
//			WebElement ele =  driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]"));
//			ele.click();
			
//			driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Angola\"]")).click();
//			
//			driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.androidsample.generalstore:id/nameField\"]")).sendKeys("test");
//		
//			driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioFemale\"]")).click();
//		
//			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]")).click();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
