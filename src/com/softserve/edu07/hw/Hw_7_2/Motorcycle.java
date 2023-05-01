package com.softserve.edu07.hw.Hw_7_2;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle(int maxSpeed) {
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

            System.out.println("Can be driven");

    }
}
