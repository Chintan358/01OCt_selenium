package fileio;

import java.io.File;
import java.io.IOException;

public class F003_File {
	public static void main(String[] args) {
		
		
		
		
		File file = new File("C:\\Chintan_work\\Files\\home.txt");
		
//		file.mkdir();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		
//		if(file.exists())
//		{
//			System.out.println("file available");
//			file.delete();
//			System.out.println("file deletd");
//		}
//		else
//		{
//			System.out.println("file not availabe");
//			try {
//				file.createNewFile();
//				System.out.println("file created");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}
}
