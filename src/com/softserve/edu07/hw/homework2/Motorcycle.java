package com.softserve.edu07.hw.homework2;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle() {
    }

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println(this + " is driving so fast!!!");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "passengers=" + getPassengers() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
