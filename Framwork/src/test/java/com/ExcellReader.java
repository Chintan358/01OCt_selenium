package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
	public static void main(String[] args) {
		ExcellReader rd = new ExcellReader();
		int row =  rd.rowCount();
		System.out.println("rows : "+row);
		int col = rd.colCount();
		System.out.println("Cols : "+col);
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i, j);
				System.out.println(data);
			}
		}
	}
	
	String filePath = "C:\\Users\\pc\\Desktop\\Test\\mytest.xlsx";
	String sheetName = "login";
	
	public int rowCount()
	{
		int row = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
		    XSSFSheet sheet = workbook.getSheet(sheetName);
		    row = sheet.getPhysicalNumberOfRows();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	
	public int colCount()
	{
		int col = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
		    XSSFSheet sheet = workbook.getSheet(sheetName);
		    col = sheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return col;
	}
	
	public String getData(int row, int col)
	{
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
		    XSSFSheet sheet = workbook.getSheet(sheetName);
		    data = sheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
}
