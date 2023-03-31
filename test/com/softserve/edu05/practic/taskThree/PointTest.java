package com.softserve.edu05.practic.taskThree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void print() {
        Point point = new Point(3,4);
        Assert.assertEquals(point.print(),"I am point and i have coordinate x = 3 y = 4");
        Assert.assertNotEquals(point.print(),"I am point and i have coordinate x = 10 y = 11");
    }
}