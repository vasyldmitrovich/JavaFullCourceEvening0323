package com.softserve.edu05.hm;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private  String type;
    private  int age;
    private  double volume;

    public Car(String type, int age, double volume) {
        this.age = age;
        this.volume = volume;
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public int getAge() {
        return age;
    }


    public String getType() {
        return type;
    }


    public static void main(String[] args) {
        Car[] car = {
                new Car("Sports car", 1994, 3.2),
                new Car("Hatchback", 2015, 2.0),
                new Car("Buss", 1999, 2.2),
                new Car("Sports car", 2000, 6.0)
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model year - ");
        int modelYear = scanner.nextInt();
        System.out.println("Certain model year:");
        for (Car cars : car) {
            if (cars.getAge() == modelYear) {
                System.out.println("Type " + cars.getType() + ", age= " + cars.getAge() + ", volume= " + cars.getVolume());

            }
        }
        Arrays.sort(car, (c1, c2) -> Double.compare(c2.getAge(), c1.getAge()));
        System.out.println(" ");
        System.out.println("Sorted cars by the field “year of production");
        for (Car cars : car) {
            System.out.println(cars.getType() + ", age: " + cars.getAge() + ", volume: " + cars.getVolume());
        }
    }
}



