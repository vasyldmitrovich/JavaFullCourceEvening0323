package com.softserve.edu05.pt;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RandomIntArrayTest {
	private RandomIntArray randomIntArray;
	private int[] intArray;
	
	@Before
	public void setUp() {
		randomIntArray = new RandomIntArray();
		intArray = new int[]{1, 2, 3, 4, -5, 6, 7, 8, 9, 0};
	}
	//not sure if random can be tested like that
	@Test
	public void shouldGenerateTenRandomIntArray() {
		int[] expected = randomIntArray.getTenRandomIntArray();
		
		Assert.assertNotEquals(expected, intArray);
	}
	
	@Test
	public void shouldFindMaxValueInArray() {
		int expected = randomIntArray.getMaxValue(intArray);
		int actual = 9;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldCalculateSumOfPositiveNumbersInArray() {
		int expected = randomIntArray.getSumOfPositiveNumbers(intArray);
		int actual = 40;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldCountNegativeNumbersInArray() {
		int expected = randomIntArray.countNegativeNumbers(intArray);
		int actual = 1;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldCountAllPositiveNumbersInArray() {
		int expected = randomIntArray.countPositiveNumbers(intArray);
		int actual = 9;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldPrintMoreNegativeMessageOfNegativePositiveValuesBalanceInArray() {
		int[] intNegativeArray = new int[] {-1, -2, -3, 4, 5, -6, -7, -8, 9, 0};
		String expected = randomIntArray.negativePositiveValuesBalance(intNegativeArray);
		String actual = "There are more negative values in the array.";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldPrintMorePositiveMessageOfNegativePositiveValuesBalanceInArray() {
		String expected = randomIntArray.negativePositiveValuesBalance(intArray);
		String actual = "There are more positive values in the array.";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldPrintEqualMessageOfNegativePositiveValuesBalanceInArray() {
		int[] intEqualArray = new int[] {-1, -2, -3, 4, 5, 6, -7, -8, 9, 0};
		String expected = randomIntArray.negativePositiveValuesBalance(intEqualArray);
		String actual = "There are equal number of positive and negative values in the array.";
		
		Assert.assertEquals(expected, actual);
	}
}