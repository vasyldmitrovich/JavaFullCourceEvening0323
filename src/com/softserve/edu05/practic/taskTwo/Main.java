package com.softserve.edu05.practic.taskTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] carsArray = new Car[4];
        carsArray[0] = new Sedan("Volvo 3Max",200,2012);
        carsArray[1] = new Truck("Pego UltraExsTrim", 250,2020);
        carsArray[2] = new Truck("BMV Bomer",180,200);
        carsArray[3] = new Sedan("Suzuki MarkX",300,2018);
        System.out.println(Arrays.toString(carsArray));
    }
}
