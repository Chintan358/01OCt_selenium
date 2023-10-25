package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class B008_DynamicTable {
	public static void main(String[] args) {
		 WebDriver driver = DriverConnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			
		 //tc-1
//		 List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr")); 
//		 if(rows.size()==4)
//		 {
//			 System.out.println("passed");
//		 }
//		 else
//		 {
//			 System.out.println("fail");
//		 }
		 
		 //tc-2
		 
//		 List<WebElement> head = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
//		 List<WebElement> data = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
//		 
//		 int total = head.size()+data.size();
//		 if(total==2)
//		 {
//			 System.out.println("pass");
//		 }
//		 else
//		 {
//			 System.out.println("fail");
//		 }
		 
		 
		 //tc-3
		 
		 int max = 0;
		 List<WebElement> heights = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
		 for(WebElement height : heights)
		 {
			 String data = height.getText();
			 int num = Integer.parseInt(data.substring(0,data.indexOf('m')));
			 if(num>max)
			 {
				 max = num;
			 }
		 }
		 
		 System.out.println("MAx hight : "+max);
		 
		 
	}
}
