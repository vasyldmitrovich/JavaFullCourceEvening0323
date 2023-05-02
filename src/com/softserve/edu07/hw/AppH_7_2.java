package com.softserve.edu07.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppH_7_2 {
    public static void main(String[] args) {

        //create some objects
        Boat b1 = new Boat(123);
        Car c1 = new Car("Audi a6");
        Bus bs1 = new Bus("Ternopil - Lviv");
        Liner l1 = new Liner(5);
        Helicopter h1 = new Helicopter(1560, 2000);
        Motocycle m1 = new Motocycle(296);
        Plane p1 = new Plane(150000);

        //print info about objects
        b1.isSailing();

        c1.drive();
        System.out.println(c1.getModel());

        l1.isSailing();
        System.out.println(l1.getFloors());

        h1.fly();
        h1.land();

        p1.getMaxDistance();
    }
}
