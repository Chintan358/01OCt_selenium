package basic;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependancyTest {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Runing login test");
		assertTrue(false);
	}
	
	@Test(priority = 2,dependsOnMethods = "login")
	public void home()
	{
		System.out.println("Runinng home test");
	}
}
