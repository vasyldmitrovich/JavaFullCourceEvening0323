package com.softserve.edu06.pt;

public class Truck extends Car {

    public Truck() {

    }

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public void run() {
        System.out.println(this.model + " is running.");
    }

    public void stop() {
        System.out.println(this.model + " has stopped.");
    }
}
