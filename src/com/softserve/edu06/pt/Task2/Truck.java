package com.softserve.edu06.pt.Task2;

public class Truck extends Car {
    public Truck() {
    }

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    protected String run() {
        return getModel() + " run";
    }

    @Override
    protected String stop() {
        return getModel() + " stop";
    }
}
