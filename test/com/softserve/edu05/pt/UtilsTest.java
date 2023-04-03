package com.softserve.edu05.pt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {
	private Utils utils;
	private String numericString;
	private String notNumericString;
	private String[] arrayOfString;
	private int[] arrayOfInt;
	
	@Before
	public void setUp() {
		utils = new Utils();
		numericString = "123";
		notNumericString = "word";
		arrayOfString = new String[]{"Hello", "how", "are", "you"};
		arrayOfInt = new int[]{1, 2, 3, 4, 5};
	}
	
	@Test
	public void isStringNumericShouldReturnTrue() {
		boolean expected = utils.isStringNumeric(numericString);
		
		Assert.assertTrue(expected);
	}
	
	@Test
	public void isStringNumericShouldReturnFalse() {
		boolean expected = utils.isStringNumeric(notNumericString);
		
		Assert.assertFalse(expected);
	}
	
	@Test
	public void getStringOfStringArrayShouldReturnStringOfStringArray() {
		String expected = utils.getStringOfStringArray(arrayOfString);
		String actual = "Hello, how, are, you.";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getStringOfIntArrayShouldReturnStringOfStringArray() {
		String expected = utils.getStringOfIntArray(arrayOfInt);
		String actual = "1, 2, 3, 4, 5.";
		
		Assert.assertEquals(expected, actual);
	}
}