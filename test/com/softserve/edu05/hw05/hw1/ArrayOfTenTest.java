package com.softserve.edu05.hw05.hw1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.softserve.edu05.hw05.hw1.ArrayOfTen.*;

class ArrayOfTenTest {
    private static int array[] = {-2, -9, 5, 8, 7, 35, 8, 5, 2, 8};
    private static int array2[] = {2, 9, 5, 8, 7, -35, 78, 56, -2, 8};


    @Test
    void sumOfFirstFiveTest() {
        Assert.assertEquals(sumOfFirstFive(array), 0);
        Assert.assertEquals(sumOfFirstFive(array2), 31);
    }

    @Test
    void productLastFiveTest() {
        Assert.assertEquals(productLastFive(array), 22400);
        Assert.assertEquals(productLastFive(array2), 34944);
    }
}