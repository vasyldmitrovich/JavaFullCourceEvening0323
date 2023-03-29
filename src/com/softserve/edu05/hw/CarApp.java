package com.softserve.edu05.hw;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("Mitsubishi", 2005, 150);
        Car car2 = new Car("KIA Sportage", 2019, 150);
        Car car3 = new Car("Audi A6", 2010, 200);
        Car car4 = new Car("Lexus", 2022, 250);

        Car[] cars = {car1, car2, car3, car4};

        // Output results for cars: certain model year (enter year in the console)
        findAndPrintCarsWithYear(cars, getYearFromConsole());

        // Output results for cars: sorted cars by the field "year of production"
        printCarsSortedByYearOfProduction(cars);
    }

    public static Integer getYearFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of production: ");
        return scanner.nextInt();
    }

    public static void findAndPrintCarsWithYear(Car[] cars, Integer inputYear) {
        boolean found = false;
        for (Car c: cars) {
            if (inputYear.equals(c.getYearOfProduction())) {
                System.out.println("Found " + c);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Car with entered 'year of production' is not found");
        }
    }

    public static void printCarsSortedByYearOfProduction(Car[] cars) {
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }

        System.out.println("\nCars sorted by the 'year of production': ");
        for (Car c: cars) {
            System.out.println(c);
        }
    }
}
