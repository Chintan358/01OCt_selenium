import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MyTest {
	public static void main(String[] args) {
		
		
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("mytest");
		option.setApp("C:\\Chintan_work\\java\\01oct_selenium\\Appium_Learning\\src\\test\\resources\\spending-tracker-2-7.apk");
		
		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),option);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
