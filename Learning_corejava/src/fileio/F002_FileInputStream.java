package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class F002_FileInputStream {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Chintan_work\\Files\\"+name+".txt");
			int i =  fis.read();
			while(i !=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
