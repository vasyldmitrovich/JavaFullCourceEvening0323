package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AppH_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year --> ");
        int a = sc.nextInt();
        Car[] cars = new Car[5];
        cars[0] = new Car("Sedan", 2019, 150);
        cars[1] = new Car("Sedan", 2020, 120);
        cars[2] = new Car("SUV", 2019, 160);
        cars[3] = new Car("Crossover", 2017, 127);
        cars[4] = new Car("Cabriolet", 2022, 285);

        if (a == 2019 || a == 2020 || a == 2017 || a == 2022) {
            System.out.println("We have this cars according to your parameters:");
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].getYearOfProduction() == a) {
                    System.out.println(cars[i].getType() + " " + cars[i].getEngineCapacity() + " hp");
                }
            }

            // Sort cars by year of production
            Arrays.sort(cars, new Comparator<Car>() {
                public int compare(Car c1, Car c2) {
                    return Integer.compare(c1.getYearOfProduction(), c2.getYearOfProduction());
                }
            });

            System.out.println("Cars sorted by year of production:");
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i].getType() + " " + cars[i].getEngineCapacity() + " hp, " + cars[i].getYearOfProduction());
            }
        } else {
            System.out.println("We don't have cars according to your parameters.");
        }
    }
}

