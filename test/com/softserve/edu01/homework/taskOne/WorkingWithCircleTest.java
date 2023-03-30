package com.softserve.edu01.homework.taskOne;

import org.junit.*;

import static org.junit.Assert.*;


public class WorkingWithCircleTest {
    private static WorkingWithCircle workingWithCircle;
    @BeforeClass
    public static void beforeTest(){
        workingWithCircle = new WorkingWithCircle();
    }
    @Test
    public void foundAndOutputPerimeter() {
        assertTrue(workingWithCircle.foundAndOutputPerimeter(3) == 18.84);
    }
    @Test
    public void foundAndOutputArea() {
        assertTrue(workingWithCircle.foundAndOutputArea(3) == 28.26);
    }

    @AfterClass
    public static void endClass(){
        workingWithCircle = null;
    }
}