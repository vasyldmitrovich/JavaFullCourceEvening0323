package com.softserve.edu05.hw.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 2001, 2.1);
        Car car2 = new Car("Toyota", 2002, 1.4);
        Car car3 = new Car("Audi", 2003, 2.7);
        Car car4 = new Car("Mercedes", 2019, 1.9);

        Car[] allCars = {car1, car2, car3, car4};

        Car.findByYear(allCars);
        System.out.println("-----------------------------");
        Car.sorByYear(allCars);

    }
}
