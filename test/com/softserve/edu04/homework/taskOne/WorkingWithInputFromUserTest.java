package com.softserve.edu04.homework.taskOne;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingWithInputFromUserTest {
    private static final int[] numbersForThreeTask = new int[]{3, -6, 12, 5, -3, 5};;
    private static WorkingWithInputFromUser workingWithInputFromUser;
    @BeforeClass
    public static void setTestClass(){
        workingWithInputFromUser = new WorkingWithInputFromUser();
        workingWithInputFromUser.setNumbersForThreeTask(numbersForThreeTask);
    }

    @Test
    public void foundMinValueElementInArray() {
        Assert.assertTrue(workingWithInputFromUser.foundMinValueElementInArray() == -6);
    }

    @Test
    public void foundIndexInArrayForMinValue() {
        Assert.assertTrue(workingWithInputFromUser.foundIndexInArrayForMinValue(workingWithInputFromUser.foundMinValueElementInArray()) == 1);
    }

    @Test
    public void foundIndexTwoPositiveNumberInArray() {
        Assert.assertTrue(workingWithInputFromUser.foundIndexTwoPositiveNumberInArray() == 2);
    }
}