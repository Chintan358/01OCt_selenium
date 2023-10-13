package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_OutStreamDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter email : ");
		String email = sc.next();
	
		FileOutputStream fos=null;
		try 
		{
			 fos = new FileOutputStream("C:\\Chintan_work\\Files\\"+name+".txt");
			System.out.println("File created...");
			String str = email;
			byte b[] = str.getBytes();
			fos.write(b);
			System.out.println("Data Written successsfully...");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
	}
}
