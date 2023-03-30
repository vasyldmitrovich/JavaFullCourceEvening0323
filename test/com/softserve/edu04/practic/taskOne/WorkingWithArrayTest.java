package com.softserve.edu04.practic.taskOne;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingWithArrayTest {
    private static String[] arrayString;
    private static double[] doublesArray;
    private static WorkingWithArray workingWithArray;

    @BeforeClass
    public static void setDateForTest(){
        arrayString = new String[]{"Dog", "Police", "Government", "Ukraine", "Cat", "Hod-dog"};
        doublesArray = new double[]{34.2, 12, 5.7, 2.1, 56, 24.2, 13, 15.9};
        workingWithArray = new WorkingWithArray();
    }

    @Test
    public void sortStringArray() {
        String[] arrayAfterSorted = {"Dog","Cat","Police","Ukraine","Hod-dog","Government"};
        Assert.assertArrayEquals(workingWithArray.sortStringArray(arrayString),arrayAfterSorted);
    }

    @Test
    public void foundAverageNumberFromArrayNumbers() {
        Assert.assertNotEquals(workingWithArray.foundAverageNumberFromArrayNumbers(doublesArray),2);
        Assert.assertTrue(workingWithArray.foundAverageNumberFromArrayNumbers(doublesArray) == 20.3875);
    }


    @Test
    public void processCheckArrayString() {
        Assert.assertFalse(workingWithArray.processCheckArrayString(arrayString,"Sun"));
        Assert.assertTrue(workingWithArray.processCheckArrayString(arrayString,"Dog"));
    }
}