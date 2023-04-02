package com.softserve.edu06.pt06.pt2;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
}
