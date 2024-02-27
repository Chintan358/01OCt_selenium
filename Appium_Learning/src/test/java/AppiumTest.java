import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTest {
	public static void main(String[] args) throws InterruptedException {
		
		

		
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("mytest");
		option.setApp("C:\\Chintan_work\\java\\01oct_selenium\\Appium_Learning\\src\\test\\resources\\worko-partner-debug (1).apk");
		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),option);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 Thread.sleep(10000);
			 
			// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
			 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.className("android.widget.EditText")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.className("android.widget.EditText")).sendKeys("8238183059");
				 
			 Thread.sleep(5000);
			 
			 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login\"]")).click();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
