package com.softserve.edu06.pt.Pt_6_2;

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public void run() {
        System.out.println("Truck is running.");
    }

    public void stop() {
        System.out.println("Truck is stopping.");
    }
}