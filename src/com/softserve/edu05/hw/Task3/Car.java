package com.softserve.edu05.hw.Task3;

import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    Car() {

    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void findByYear(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Cars from " + year + ": ");
        boolean ifNull = true;
        for (Car temp : cars) {
            if (temp.getYearOfProduction() == year) {
                System.out.println(temp.getType());
                ifNull = false;
            }
        }
        if (ifNull) {
            System.out.println("Not found");
        }
    }

    public static void sorByYear(Car[] cars){
        Car temp;
        for (int i = 0; i < cars.length - 1; i++){
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println("Sort by year cars: ");
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
