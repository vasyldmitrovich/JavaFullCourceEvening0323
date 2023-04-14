package com.softserve.edu06.pt;

public class Truck extends Car {
    private int carryingCapacity;

    public Truck(String model, int maxSpeed, int yearOfProduction, int carryingCapacity){
        super(model, maxSpeed, yearOfProduction);
        this.carryingCapacity = carryingCapacity;
    }
    @Override
    public void run() {
        super.run();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public String toString(){
        return "Truck " + super.getModel() + "; year of production: " + super.getYearOfProduction()
                + "; max speed: " + super.getMaxSpeed() + "km/hour; carrying capacity: " + carryingCapacity + "kg";
    }
}
