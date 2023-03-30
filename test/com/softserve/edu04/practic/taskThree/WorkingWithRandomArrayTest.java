package com.softserve.edu04.practic.taskThree;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingWithRandomArrayTest {
    private static WorkingWithRandomArray workingWithRandomArray;

    @BeforeClass
    public static void setDateForTest(){
        workingWithRandomArray = new WorkingWithRandomArray(new int[]{3,2,-10,-5,12,-3,-2,1,13});
    }

    @Test
    public void getBigNumberInRandomArray() {
        Assert.assertEquals(workingWithRandomArray.getBigNumberInRandomArray(),13);
        Assert.assertNotEquals(workingWithRandomArray.getBigNumberInRandomArray(),3);
    }

    @Test
    public void getSumAllPositiveNumbersInArray() {
        Assert.assertEquals(workingWithRandomArray.getSumAllPositiveNumbersInArray(),31);
        Assert.assertNotEquals(workingWithRandomArray.getSumAllPositiveNumbersInArray(),20);
    }

    @Test
    public void getCountAllNegativeNumbers() {
        Assert.assertNotEquals(workingWithRandomArray.getCountAllNegativeNumbers(),5);
        Assert.assertEquals(workingWithRandomArray.getCountAllNegativeNumbers(),4);
    }

    @Test
    public void foundWhatMoreNegativeOrPositiveNumberInArray() {
        Assert.assertEquals(workingWithRandomArray.foundWhatMoreNegativeOrPositiveNumberInArray(),"There are more positive values in the array");
        Assert.assertNotEquals(workingWithRandomArray.foundWhatMoreNegativeOrPositiveNumberInArray(),"There are an equal number of positive and negative values in the array");
    }
}