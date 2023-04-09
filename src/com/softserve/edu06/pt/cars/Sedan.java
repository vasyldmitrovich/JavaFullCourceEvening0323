package com.softserve.edu06.pt.cars;

public class Sedan extends Car {

    public Sedan() {
    }

    public Sedan(String model, Integer maxSpeed, Integer yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public void run() {
        System.out.println("Sedan " + this.model + " is running");
    }

    public void stop() {
        System.out.println("Sedan " + this.model + " stopped");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
