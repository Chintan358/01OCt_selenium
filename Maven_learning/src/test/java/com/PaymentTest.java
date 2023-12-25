package com;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PaymentTest {

		@Test
		public void creditCard()
		{
			System.out.println("Credit cardayment");
		}
		
		@Test
		public void debitCard()
		{
			System.out.println("Debit card payment");
			//assertTrue(false);
		}
		
		
		@Test
		public void cod()
		{
			System.out.println("cod payment");
		}
}
