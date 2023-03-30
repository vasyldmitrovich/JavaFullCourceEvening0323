package com.softserve.edu01.practic.taskThree;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculationTest {
    private static Calculation calculation;
    @BeforeClass
    public static void setUpClass(){
        calculation = new Calculation();
    }

    @Test
    public void chooseOperationAndStartOperation() {
        RuntimeException thrown = Assert.assertThrows(RuntimeException.class, ()->calculation.chooseOperationAndStartOperation(0,2,-5));
    }

    @Test
    public void multiplicationNumbers() {
        Assert.assertEquals(calculation.multiplicationNumbers(2,3),6);
    }

    @Test
    public void divisionNumbers() {
        Assert.assertEquals(calculation.divisionNumbers(9,3),3);
    }

    @Test
    public void minusNumbers() {
        Assert.assertEquals(calculation.minusNumbers(-10,-10), 0);
    }

    @Test
    public void plusNumber() {
        Assert.assertEquals(calculation.plusNumber(5,-6), -1);
    }
}