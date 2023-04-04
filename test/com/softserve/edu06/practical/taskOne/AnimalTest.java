package com.softserve.edu06.practical.taskOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnimalTest {
    private static ArrayList<Animal> animals = new ArrayList<>();
    @BeforeClass
    public static void getDateForTest(){
        animals.add(new Cat("Bob"));
        animals.add(new Dog("Anderson"));
        animals.add(new Dog("Ken"));
        animals.add(new Cat("Milka"));
        animals.add(new Cat("Maks"));
    }

    @Test
    public void voice() {
        Assert.assertNotEquals(animals.get(2).voice(),"Gav-Gav my name is Anderson");
        Assert.assertTrue(animals.get(1) instanceof Animal);
    }

    @Test
    public void feed() {
        Assert.assertEquals(animals.get(3).feed(),"I cat and like eat fish!");
        Assert.assertTrue(animals.get(4) instanceof Cat);
    }
}