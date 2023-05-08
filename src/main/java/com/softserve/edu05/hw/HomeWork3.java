package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 2000, 2.0);
        Car car2 = new Car("Opel", 1988, 1.6);
        Car car3 = new Car("Mercedes", 2010, 2.4);
        Car car4 = new Car("Reno", 2004, 1.8);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year of the production: ");
        int yearOfProduction = scan.nextInt();

        if (car1.getYearOfProduction() == yearOfProduction) {
            System.out.println("It's " + car1.getType());
        }
        if (car2.getYearOfProduction() == yearOfProduction) {
            System.out.println("It's " + car2.getType());
        }
        if (car3.getYearOfProduction() == yearOfProduction) {
            System.out.println("It's " + car3.getType());
        }
        if (car4.getYearOfProduction() == yearOfProduction) {
            System.out.println("It's " + car4.getType());
        }

        Car cars[] = new Car[4];
        cars[0] = new Car("Audi", 2000, 2.0);
        cars[1] = new Car("Opel", 1988, 1.6);
        cars[2] = new Car("Mercedes", 2010, 2.4);
        cars[3] = new Car("Reno", 2004, 1.8);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYearOfProduction));
        for (Car car : cars) {
            System.out.println(car.getType() + " is " + car.getYearOfProduction() + " year.");
        }

    }
}
