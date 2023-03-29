package com.softserve.edu05.hw05.hw1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.softserve.edu05.hw05.hw1.Months.numberOfDays;
import static org.junit.jupiter.api.Assertions.*;

class MonthsTest {

    @Test
    void numberOfDaysTest() {
        Assert.assertEquals(numberOfDays(1), 31);
        Assert.assertNotEquals(numberOfDays(2), 31);
        Assert.assertNotNull(numberOfDays(3));
    }
}