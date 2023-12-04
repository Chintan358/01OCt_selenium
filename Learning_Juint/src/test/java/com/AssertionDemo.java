package com;

import static org.junit.Assert.*;


import org.junit.Test;

public class AssertionDemo {
	
	@Test
	public void test()
	{
		
		//int a = 10;
		//int b = 20;
		
		//assertEquals(a, b);
		//assertNotEquals(b, a);
		//assertTrue(a>b);
		//assertFalse(a>b);
		//assertNull(a);
		//assertNotNull(a);
		
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		
		//assertEquals(i, j);
		//assertSame(i, j);
		
		int a[] = {10,20,30,40,50,70};
		int b[] = {10,20,30,40,50,60};
		
		assertArrayEquals(a, b);
	}
}
