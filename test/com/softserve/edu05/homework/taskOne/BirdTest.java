package com.softserve.edu05.homework.taskOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {
    private Eagle eagle;
    private Swallow swallow;
    private Penguin penguin;
    @Before
    public void setDateForTest(){
        eagle = new Eagle();
        swallow = new Swallow();
        penguin = new Penguin();
    }
    @Test
    public void fly() {
        Assert.assertEquals(eagle.fly(),"I am eagle and i can fly");
        Assert.assertNotEquals(penguin.fly(),"I am kiwi and i can not fly");
        Assert.assertNotEquals(swallow.fly(),eagle.fly());
    }
}