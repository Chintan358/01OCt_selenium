import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class AppiumTest {
	public static void main(String[] args) {
		
		
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "test");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "C:\\Chintan_work\\java\\01oct_selenium\\Appium_Learning\\src\\test\\resources\\facebook-lite-391-0-0-11-115.apk");
		
		cap.setCapability("automationName", "UiAutomator");
		URL url=null;
		try {
			url = new URL("http://127.0.0.1:4723/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AppiumDriver driver=new AppiumDriver(url,cap);
		
		
	}
}
