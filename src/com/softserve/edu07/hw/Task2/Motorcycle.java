package com.softserve.edu07.hw.Task2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    protected Motorcycle() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void drive() {
        System.out.println("I`m motorcycle from ground vehicle and i can drive");
    }
}
