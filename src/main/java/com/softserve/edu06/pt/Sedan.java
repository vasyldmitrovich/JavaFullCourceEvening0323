package com.softserve.edu06.pt;

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println(getModel() + " is run.");
    }

    @Override
    void stop() {
        System.out.println(getModel() + " is stop.");
    }
}
