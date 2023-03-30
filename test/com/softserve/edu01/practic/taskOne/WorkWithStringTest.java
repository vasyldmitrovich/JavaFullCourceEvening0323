package com.softserve.edu01.practic.taskOne;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkWithStringTest {
    private static WorkWithString workWithString;
    @BeforeClass
    public static void setUpClass(){
        workWithString = new WorkWithString();
    }

    @Test
    public void processGetFinalString() {
        Assert.assertEquals(workWithString.processGetFinalString("er","or","ru"),"Output text:\nru\nor\ner");
    }
}