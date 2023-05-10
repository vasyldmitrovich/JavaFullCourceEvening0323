package com.softserve.edu06.pt;

public class Sedan extends Car {

    public Sedan() {

    }

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public void run() {
        System.out.println("This sedan is running.");
    }

    public void stop() {
        System.out.println("This sedan has stopped.");
    }
}
