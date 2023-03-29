package com.softserve.edu05.hw05.hw3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static void sortOfCars(List<Car> cars) {
        List sortedList = cars.stream().sorted(Comparator.comparingInt(Car::getYearOfProduction)).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
