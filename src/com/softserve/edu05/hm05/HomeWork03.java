package com.softserve.edu05.hm05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        // Create and initialize four instances of Car
        Car car1 = new Car("SUV", 2015, 3.5);
        Car car2 = new Car("Sedan", 2010, 2.0);
        Car car3 = new Car("Hatchback", 2018, 1.6);
        Car car4 = new Car("Sports car", 2021, 2.5);

        // Output cars for a certain model year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a model year: ");
        int modelYear = scanner.nextInt();
        for (Car car : new Car[] {car1, car2, car3, car4}) {
            if (car.year == modelYear) {
                System.out.println(car);
            }
        }

        // Sort cars by year of production
        Car[] sortedCars = {car1, car2, car3, car4};
        Arrays.sort(sortedCars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Integer.compare(car1.year, car2.year);
            }
        });
        System.out.println("Cars sorted by year of production:");
        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }
}
