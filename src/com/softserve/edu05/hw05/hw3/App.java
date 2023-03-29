package com.softserve.edu05.hw05.hw3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.softserve.edu05.hw05.hw3.CarService.findByYear;
import static com.softserve.edu05.hw05.hw3.CarService.sortOfCars;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List cars = Arrays.asList(
                new Car("Model1", 1995, 280),
                new Car("Model2", 1997, 285),
                new Car("Model3", 2000, 280),
                new Car("Model4", 2005, 300));
        sortOfCars(cars);
        System.out.println("Input year of car that you would like to find");
        int year = sc.nextInt();
        System.out.println(findByYear(year, cars));
    }
}
