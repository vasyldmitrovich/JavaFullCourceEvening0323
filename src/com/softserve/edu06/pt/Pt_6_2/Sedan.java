package com.softserve.edu06.pt.Pt_6_2;

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public void run() {
        System.out.println("Sedan is running.");
    }

    public void stop() {
        System.out.println("Sedan is stopping.");
    }
}