package com.softserve.edu05.pt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayPracticeTest {
	private ArrayPractice arrayPractice;
	private String[] stringArray;
	private int[] intArray;
	
	@Before
	public void setUp() {
		arrayPractice = new ArrayPractice();
		stringArray = new String[]{"true", "false", "boolean"};
		intArray = new int[]{1, 9, 2, 5};
	}
	
	@Test
	public void stringArraySorter() {
		String[] expected = arrayPractice.stringArraySorter(stringArray);
		String[] actual = new String[]{"boolean", "false", "true"};
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnAverageOfIntArrayValues() {
		int expected = arrayPractice.getAverageOfIntArrayValues(intArray);
		int actual = 4;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isElementPresentInOneOfTwoArraysShouldReturnTrueToString() {
		boolean expected = arrayPractice.isElementPresentInOneOfTwoArrays(stringArray, intArray, "boolean");
		
		Assert.assertTrue(expected);
	}
	
	@Test
	public void isElementPresentInOneOfTwoArraysShouldReturnFalseToString() {
		boolean expected = arrayPractice.isElementPresentInOneOfTwoArrays(stringArray, intArray, "blah");
		
		Assert.assertFalse(expected);
	}
	
	@Test
	public void isElementPresentInOneOfTwoArraysShouldReturnTrueToInt() {
		boolean expected = arrayPractice.isElementPresentInOneOfTwoArrays(stringArray, intArray, "5");
		
		Assert.assertTrue(expected);
	}
	
	@Test
	public void isElementPresentInOneOfTwoArraysShouldReturnFalseToInt() {
		boolean expected = arrayPractice.isElementPresentInOneOfTwoArrays(stringArray, intArray, "7");
		
		Assert.assertFalse(expected);
	}
}