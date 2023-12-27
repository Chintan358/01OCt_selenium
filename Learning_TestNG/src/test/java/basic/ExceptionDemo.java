package basic;

import org.testng.annotations.Test;

public class ExceptionDemo {
		
		@Test(expectedExceptions = ArithmeticException.class)
		public void test()
		{
			int i=10;
			int j = i/0;
			System.out.println(j);
		}
}
