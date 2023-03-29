package com.softserve.edu05.hw05.hw3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static com.softserve.edu05.hw05.hw3.CarService.*;

class CarServiceTest {
    private static List cars = Arrays.asList(
            new Car("Model1", 2010, 2),
            new Car("Model2", 2015, 3),
            new Car("Model3", 2004, 2),
            new Car("Model4", 2010, 5));

    private static List cars2 = Arrays.asList(
            new Car("Model1", 2010, 2));

    private static List cars3 = Arrays.asList(
            new Car("Model1", 2010, 2),
            new Car("Model2", 2009, 2));

    private static List cars4 = Arrays.asList();

    @Test
    void sortOfCarsTest() {
        Assert.assertNotNull(sortOfCars(cars3));
        Assert.assertEquals(sortOfCars(cars4), new ArrayList());
    }

    @Test
    void findByYearTest() {
        Assert.assertNotNull(findByYear(2010, cars));
        Assert.assertEquals(findByYear(2010,cars2),cars2);
    }
}