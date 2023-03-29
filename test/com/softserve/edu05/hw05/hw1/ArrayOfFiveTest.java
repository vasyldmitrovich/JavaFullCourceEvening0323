package com.softserve.edu05.hw05.hw1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.softserve.edu05.hw05.hw1.ArrayOfFive.*;

class ArrayOfFiveTest {
    private static int array[] = {-2, -9, 5, 8, 7};
    private static int array2[] = {-2, -9, -5, -8, 7};

    @Test
    void positionOfSecondPosNumberTest() {
        Assert.assertEquals(positionOfSecondPosNumber(array),4);
        Assert.assertEquals(positionOfSecondPosNumber(array2),0);
        Assert.assertNotNull(positionOfSecondPosNumber(array));
    }

    @Test
    void minValueTest() {

        Assert.assertEquals(minValue(array), -9);
        Assert.assertNotNull(minValue(array2));
    }

    @Test
    void productOfEvenTest() {

        Assert.assertNotNull(productOfEven(array));
        Assert.assertNotEquals(productOfEven(array2),1);
    }
}