package com.softserve.edu05.hw;

import java.util.*;

public class Hw_5_3 {
    public static void main(String[] args) {
        List<Cars> cars = new ArrayList<>(Arrays.asList());
        cars.add(new Cars("SUV", 2021, 3.5));
        cars.add(new Cars("Sedan", 2019, 2.0));
        cars.add(new Cars("Hatchback", 2022, 1.8));
        cars.add(new Cars("Pickup", 2018, 5.7));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which model year you want to see: ");
        int model_year = sc.nextInt();
        for (Cars car : cars) {
            if (car.getYear() == model_year) {
                System.out.println("Car " + model_year + "th: " + car.getType());
            }
        }

        Collections.sort(cars, Comparator.comparing(Cars::getYear));

        System.out.println("Sorted Cars: ");

        for (Cars car : cars) {
            System.out.println("Type: " + car.getType() + " Year: " + car.getYear() + " Engine capacity: " + car.getCapacity());

        }


    }


}
