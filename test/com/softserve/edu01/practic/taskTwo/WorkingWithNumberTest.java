package com.softserve.edu01.practic.taskTwo;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingWithNumberTest {
    private static WorkingWithNumber workingWithNumber;

    @BeforeClass
    public static void setClass() {
        workingWithNumber = new WorkingWithNumber();
    }

    @Test
    public void foundAverageFromThreeNumbers() {
        Assert.assertTrue(workingWithNumber.foundAverageFromThreeNumbers(2, 4, 6) == 4.0);
    }
}