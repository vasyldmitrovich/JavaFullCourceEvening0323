package com.softserve.edu05.hw;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array10IntegerNumbersTest {

    public static Integer[] numbers1 = {3, 7, 8, 12, 10, 10, 7, 8, 11, -2};

    public static Integer[] numbers2 = {3, -7, 8, -12, 10, 10, 7, 8, 11, 2};

    @Test
    public void testIsPositiveTrue() {
        assertTrue(Array10IntegerNumbersApp.isPositive(numbers1));
    }

    @Test
    public void testIsPositiveFalse() {
        assertFalse(Array10IntegerNumbersApp.isPositive(numbers2));
    }

    @Test
    public void testSumOfFirstFiveNumbers() {
        assertEquals(Array10IntegerNumbersApp.sumOfFirstFiveNumbers(numbers1), Integer.valueOf(40));
    }

    @Test
    public void testProductOfLastFiveNumbers() {
        assertEquals(Array10IntegerNumbersApp.productOfLastFiveNumbers(numbers1), Integer.valueOf(6160));
    }

    @Test
    public void testProductOfLastFiveNumbers2() {
        assertEquals(Array10IntegerNumbersApp.productOfLastFiveNumbers(numbers2), Integer.valueOf(12320));
    }
}
