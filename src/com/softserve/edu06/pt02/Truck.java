package com.softserve.edu06.pt02;

public class Truck extends Car {
    public Truck(String name, int maxSpeed, int yearOfProduction) {
        super(name, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}
