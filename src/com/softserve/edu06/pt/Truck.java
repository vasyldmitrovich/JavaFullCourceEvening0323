package com.softserve.edu06.pt;

class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println(getModel() + " is run.");

    }

    @Override
    public void stop() {
        System.out.println(getModel() + " is stop.");
    }
}
