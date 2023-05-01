package com.softserve.edu06.pt.Pt_6_2;

abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
