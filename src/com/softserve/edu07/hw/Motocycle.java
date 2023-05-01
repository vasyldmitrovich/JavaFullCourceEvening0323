package com.softserve.edu07.hw;

public class Motocycle extends GroundVehicle{
    private int maxSpeed;

    public Motocycle(int maxSpeed) {
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
        System.out.println("Can drive");
    }
}
