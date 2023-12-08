package basic;

import org.testng.annotations.Test;

public class NewTest {
		
		@Test(priority = 1)
		public void test()
		{
			System.out.println("Runing test");
		}
		
		@Test(priority = 4)
		public void alpha()
		{
			System.out.println("runing alpha test");
		}
		
		@Test(priority = 2,enabled = false)
		public void beta()
		{
			System.out.println("Running beta test");
		}
		
		@Test(priority = 3)
		public void gama()
		{
			System.out.println("runinng gama test");
		}
		
}
