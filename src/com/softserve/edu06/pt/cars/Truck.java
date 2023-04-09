package com.softserve.edu06.pt.cars;

public class Truck extends Car {

    public Truck() {
    }

    public Truck(String model, Integer maxSpeed, Integer yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public void run() {
        System.out.println("Truck " + this.model + " is running");
    }

    public void stop() {
        System.out.println("Truck " + this.model + " stopped");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
