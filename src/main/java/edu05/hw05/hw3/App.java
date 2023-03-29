package edu05.hw05.hw3;

import java.util.Arrays;
import java.util.List;

import static edu05.hw05.hw3.CarService.sortOfCars;

public class App {
    public static void main(String[] args) {
        List cars = Arrays.asList(
                new Car("Model1", 1995, 280),
                new Car("Model2", 1997, 285),
                new Car("Model3", 2000, 280),
                new Car("Model4", 2005, 300));
        sortOfCars(cars);
    }
}
