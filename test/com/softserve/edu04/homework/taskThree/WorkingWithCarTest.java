package com.softserve.edu04.homework.taskThree;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

public class WorkingWithCarTest {
    private static Car[] cars;
    @BeforeClass
    public static void setDateForClassTest(){
        cars = new Car[]{
                new Car(Type.SUPERCAR, Date.valueOf("2002-10-03"),3.4f),
                new Car(Type.MICRO, Date.valueOf("1900-02-23"),2.1f),
                new Car(Type.LIMOUSINE, Date.valueOf("2020-04-30"),2.9f),
                new Car(Type.LIMOUSINE, Date.valueOf("2010-12-10"),4.2f)
        };
    }

    @Test
    public void foundCarWithYear() {
        List<Car> carList = WorkingWithCar.foundCarWithYear(Date.valueOf("1900-02-23"),cars);
        Assert.assertEquals(carList.size(),1);
    }

    @Test
    public void sortedArrayCars() {
        Car[] carsAfterSorted = WorkingWithCar.sortedArrayCars(cars);
        Car[] carsArrayForCheck = {
                new Car(Type.LIMOUSINE, Date.valueOf("2020-04-30"),2.9f),
                new Car(Type.LIMOUSINE, Date.valueOf("2010-12-10"),4.2f),
                new Car(Type.SUPERCAR, Date.valueOf("2002-10-03"),3.4f),
                new Car(Type.MICRO, Date.valueOf("1900-02-23"),2.1f),
        };
        Assert.assertArrayEquals(carsAfterSorted,carsArrayForCheck);
    }
}