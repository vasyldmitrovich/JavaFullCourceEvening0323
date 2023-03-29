package com.softserve.edu04.homework.taskThree;

import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

public class WorkingWithCar {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Car carOne = new Car(Type.SEDAN, Date.valueOf("2002-03-13"), 3.4f);
        Car carTwo = new Car(Type.MICRO, Date.valueOf("2021-01-23"), 2.1f);
        Car carThree = new Car(Type.LIMOUSINE, Date.valueOf("1995-12-25"), 2.9f);
        Car carFour = new Car(Type.SUPERCAR, Date.valueOf("2023-01-30"), 4.4f);
        System.out.println("Found car with date");
        System.out.print("Input date in format yyyy-mm-dd: ");
        Date dateFromUser = Date.valueOf(scanner.nextLine());
        List<Car> listResultAfterProcessFound = foundCarWithYear(dateFromUser, carOne, carTwo, carThree, carFour);
        if (listResultAfterProcessFound.size() != 0) {
            listResultAfterProcessFound.forEach(System.out::println);
        } else {
            System.out.println("Not found car with it is date " + dateFromUser);
        }
        System.out.println("Sorted array car");
        System.out.println(Arrays.toString(sortedArrayCars(carOne, carTwo, carThree, carFour)));

    }

    public static List<Car> foundCarWithYear(Date dateFromUser, Car... cars) {
        return Arrays.stream(cars).filter(car -> car.getYear_of_production().getTime() == dateFromUser.getTime()).collect(Collectors.toList());
    }

    public static Car[] sortedArrayCars(Car... cars) {
        return Arrays.stream(cars).sorted(Comparator.comparing(Car::getYear_of_production).reversed()).toArray(Car[]::new);
    }
}
