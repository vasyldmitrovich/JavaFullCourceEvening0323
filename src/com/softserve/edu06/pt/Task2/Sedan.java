package com.softserve.edu06.pt.Task2;

public class Sedan extends Car {
    public Sedan() {
    }

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
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
