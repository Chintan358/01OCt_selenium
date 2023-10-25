package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class B007_StaticTable {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		
//	   String data = 	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
//	   System.out.println(data);
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		List<WebElement> heads = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(WebElement h : heads)
		{
			System.out.print(h.getText()+" | ");
		}
		System.out.println();
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(WebElement col : cols)
			{
				System.out.print(col.getText()+" | ");
			}
			System.out.println();
		}
		
		
	}
}
