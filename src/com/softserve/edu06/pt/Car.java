package com.softserve.edu06.pt;

abstract class Car {
    private String Model;
    private int maxSpeed;
    private int yearOfProduction;

    Car(){

    }

    public Car(String model, int Maxspeed, int YearOfProduction) {
        Model = model;
        maxSpeed = Maxspeed;
        yearOfProduction = YearOfProduction;
    }
    abstract void run();
    abstract void Stop();

    public String getModel() {
        return Model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
