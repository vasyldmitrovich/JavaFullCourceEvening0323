package com.softserve.edu05.hw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoNumbersSumTest {
	private TwoNumbersSum twoNumbersSum;
	private int[] numbers;
	
	@Before
	public void setUp() {
		twoNumbersSum = new TwoNumbersSum();
	}
	//Sonar suggests to make parametrized test, should I do that?
	@Test
	public void shouldReturnSumOfTwoPositiveNumbers() {
		numbers = new int[]{2, 6};
		int expected = twoNumbersSum.getSumOfTwoNumbers(numbers);
		int actual = 8;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnSumOfOnePositiveOneNegativeNumber() {
		numbers = new int[]{2, -6};
		int expected = twoNumbersSum.getSumOfTwoNumbers(numbers);
		int actual = -4;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnSumOfTwoNegativeNumbers() {
		numbers = new int[]{-2, -6};
		int expected = twoNumbersSum.getSumOfTwoNumbers(numbers);
		int actual = -8;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnSumOfZeroAndPositiveNumber() {
		numbers = new int[]{0, 6};
		int expected = twoNumbersSum.getSumOfTwoNumbers(numbers);
		int actual = 6;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnSumOfTwoZeros() {
		numbers = new int[]{0, 0};
		int expected = twoNumbersSum.getSumOfTwoNumbers(numbers);
		int actual = 0;
		
		Assert.assertEquals(expected, actual);
	}
}