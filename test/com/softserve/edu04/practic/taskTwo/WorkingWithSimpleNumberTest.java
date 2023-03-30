package com.softserve.edu04.practic.taskTwo;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class WorkingWithSimpleNumberTest {
    private static WorkingWithSimpleNumber workingWithSimpleNumber;
    @BeforeClass
    public static void setDateForTest(){
        workingWithSimpleNumber = new WorkingWithSimpleNumber();
    }

    @Test
    public void checkNumberOnSimple() {
        Assert.assertTrue(workingWithSimpleNumber.checkNumberOnSimple(13));
        Assert.assertTrue(workingWithSimpleNumber.checkNumberOnSimple(7));
    }
}