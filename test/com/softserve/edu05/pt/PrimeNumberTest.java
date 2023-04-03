package com.softserve.edu05.pt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {
	private PrimeNumber primeNumber;
	
	@Before
	public void setUp() {
		primeNumber = new PrimeNumber();
	}
	
	@Test
	public void isPrimeNumberShouldReturnYesMessage() {
		String expected = primeNumber.isPrimeNumber(11);
		String actual = "Is a prime number.";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isPrimeNumberShouldReturnNoMessage() {
		String expected = primeNumber.isPrimeNumber(9);
		String actual = "Is not a prime number.";
		
		Assert.assertEquals(expected, actual);
	}
}