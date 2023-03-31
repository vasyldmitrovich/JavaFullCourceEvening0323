package com.softserve.edu05.practic.taskTwo;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public String run() {
        return "I starting run on Truck";
    }

    @Override
    public String stop() {
        return "I stopped on Truck";
    }
}
