package com.softserve.edu05.hw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FiveIntegerArrayPracticeTest {
	private FiveIntegerArrayPractice fiveIntegerArrayPractice;
	int[] intArray;
	
	@Before
	public void setUp() {
		fiveIntegerArrayPractice = new FiveIntegerArrayPractice();
		intArray = new int[]{0, -1, 2, 9, 4};
	}
	
	@Test
	public void shouldReturnSecondPositiveNumber() {
		int expected = fiveIntegerArrayPractice.getSecondPositiveNumber(intArray);
		int actual = 2;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnMinValue() {
		int expected = fiveIntegerArrayPractice.getMinValue(intArray);
		int actual = -1;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnPositionOfCurrentValue() {
		int expected = fiveIntegerArrayPractice.getPositionOfCurrentValue(intArray, 4);
		int actual = 4;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnProductOfAllEvenNumbers() {
		int expected = fiveIntegerArrayPractice.getProductOfAllEvenNumbers(intArray);
		int actual = 8;
		
		Assert.assertEquals(expected, actual);
	}
}