package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class StaticWebtable {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
			for(WebElement col : cols)
			{
				System.out.print(col.getText()+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
