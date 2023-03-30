package com.softserve.edu05.hm05;

public class Car {
    private String type;
    public int year;
    private double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return type + ", " + year + ", " + engineCapacity;
    }
}
