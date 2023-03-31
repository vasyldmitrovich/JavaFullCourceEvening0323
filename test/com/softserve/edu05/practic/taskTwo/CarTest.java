package com.softserve.edu05.practic.taskTwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    private Truck truck;
    private Sedan sedan;
    @Before
    public void setDateForTest(){
        truck = new Truck("Pego UltraExsTrim", 250,2020);
        sedan = new Sedan("BMV Bomer",180,200);
    }

    @Test
    public void run() {
        Assert.assertEquals(truck.run(),"I starting run on Truck");
        Assert.assertNotEquals(sedan.run(),"I starting run on Truck");
    }

    @Test
    public void stop() {
        Assert.assertEquals(truck.stop(),"I stopped on Truck");
        Assert.assertNotEquals(sedan.stop(),"I stopped on Truck");
    }
}