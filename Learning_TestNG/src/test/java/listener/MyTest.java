package listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test()
	{
		System.out.println("test1");
		assertTrue(false);
	}
	
	@Test
	public void test1()
	{
		System.out.println("test2");
	}
}
