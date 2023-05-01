package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTaskCarsCatalogue {
    public static void main(String[] args) {
        Car[] cars = fillTheArray();
        searchForCars(cars);
        Arrays.sort(cars, new Car.CarsByYear());

        System.out.println("sorted array:");
        for(Car car : cars){
            System.out.println(car);
        }
    }

    //Nice this method is good
    static Car[] fillTheArray(){
        System.out.print("Input number of cars: ");
        int size = new Scanner(System.in).nextInt();
        Car[] cars = new Car[size];

        for (int i = 0; i < size; i++){
            Car car = new Car();

            System.out.println("Add car #" + (i + 1) + ": ");
            System.out.print("\tType:");
            car.setType(TypesOfCars.valueOf(new Scanner(System.in).next().toUpperCase()));
            System.out.print("\tEngine capacity: ");
            car.setEngineCapacity(new Scanner(System.in).nextDouble());
            System.out.print("\tYear of production: ");
            car.setYearOfProduction(new Scanner(System.in).nextInt());

            cars[i] = car;
        }
        return cars;
    }

    static void searchForCars(Car[] cars){
        System.out.print("Input the year for searching: ");
        int year = new Scanner(System.in).nextInt();

        for (Car car : cars){
            if(car.getYearOfProduction() == year){
                System.out.println(car);
            }
        }
    }
}
