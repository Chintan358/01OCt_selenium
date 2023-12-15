package basic;

import org.testng.annotations.Test;

public class Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	public void test()
	{
		int i = 10;
		int j = i/0;	
	}
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void test2()
	{
		int a[] = new int[5];
		a[6] = 45;
		System.out.println("Runinng...");
	}
	
}
