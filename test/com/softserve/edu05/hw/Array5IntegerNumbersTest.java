package com.softserve.edu05.hw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array5IntegerNumbersTest {

    public static Integer[] numbers = {2, -2, 4, 5, 7};

    @Test
    public void testPositionOfSecondPositiveNumber() {
        assertEquals(Array5IntegerNumbersApp.getPositionOfSecondPositiveNumber(numbers), 3);
    }

    @Test
    public void testMinimumValue() {
        assertEquals(Array5IntegerNumbersApp.getMinimumNumber(numbers), Integer.valueOf(-2));
    }

    @Test
    public void testPositionOfMinimumValue() {
        int min = Array5IntegerNumbersApp.getMinimumNumber(numbers);
        assertEquals(Array5IntegerNumbersApp.getPositionOfNumber(numbers, min), 2);
    }

    @Test
    public void testCalculateProductOfEvenNumbers() {
        assertEquals(Array5IntegerNumbersApp.calculateProductOfEvenNumbers(numbers), -16);
    }
}
