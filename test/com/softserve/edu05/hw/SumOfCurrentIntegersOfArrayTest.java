package com.softserve.edu05.hw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfCurrentIntegersOfArrayTest {
	private SumOfCurrentIntegersOfArray sumOfCurrentIntegersOfArray;
	private int[] intArrayAllPositive;
	private int[] intArrayAllNegative;
	private int[] intArrayFirstFivePositive;
	private int[] intArrayLastFivePositive;
	
	@Before
	public void setUp() {
		sumOfCurrentIntegersOfArray = new SumOfCurrentIntegersOfArray();
		intArrayAllNegative = new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		intArrayAllPositive = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		intArrayFirstFivePositive = new int[]{1, 2, 3, 4, 5, -3, 5, 4, 6, 6};
		intArrayLastFivePositive = new int[]{1, 2, -3, 4, 5, 6, 7, 8, 9, 0};
	}
	
	@Test
	public void getSumOfFivePositiveNumbersShouldReturnZeroOfAllNegative() {
		int expected = sumOfCurrentIntegersOfArray.getSumOfFivePositiveNumbers(intArrayAllNegative);
		int actual = 0;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getSumOfFivePositiveNumbersShouldReturnSumOfFirstFiveOfAllPositive() {
		int expected = sumOfCurrentIntegersOfArray.getSumOfFirstFiveNumbers(intArrayAllPositive);
		int actual = 15;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getSumOfFivePositiveNumbersShouldReturnSumOfFirstFive() {
		int expected = sumOfCurrentIntegersOfArray.getSumOfFirstFiveNumbers(intArrayFirstFivePositive);
		int actual = 15;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getSumOfFivePositiveNumbersShouldReturnSumOfLastFive() {
		int expected = sumOfCurrentIntegersOfArray.getSumOfFivePositiveNumbers(intArrayLastFivePositive);
		int actual = 30;
		
		Assert.assertEquals(expected, actual);
	}
}