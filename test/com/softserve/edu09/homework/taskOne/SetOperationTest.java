package com.softserve.edu09.homework.taskOne;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetOperationTest {

    private static Set<Integer> setOne;
    
    private static Set<Integer> setTwo;

    private static SetOperation setOperation = new SetOperation();

    @BeforeClass
    public static void setDate(){
        setOne = new HashSet<>();
        setOne.add(3);
        setOne.add(2);
        setOne.add(13);
        setTwo = new HashSet<>();
        setTwo.add(24);
        setTwo.add(2);
        setTwo.add(3);
    }

    @Test
    public void union() {
        Set setResult = setOperation.union(setOne,setTwo);
        System.out.println("Result set: "+setResult);
        Assert.assertTrue(setResult.contains(3));
        Assert.assertTrue(setResult.size() == 4);
        Assert.assertTrue(setResult.containsAll(setOne));
        Assert.assertFalse(setResult.isEmpty());
    }

    @Test
    public void interest() {
        Set<Integer> integerSetResult = setOperation.interest(setOne,setTwo);
        System.out.println("Result set: "+integerSetResult);
        Assert.assertTrue(integerSetResult.size() == 2);
        Assert.assertFalse(integerSetResult.isEmpty());
        Assert.assertTrue(integerSetResult.contains(3));
    }
}