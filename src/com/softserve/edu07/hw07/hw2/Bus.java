package com.softserve.edu07.hw07.hw2;

public class Bus extends GroundVehicle{
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Bus(int passengers) {
        super(passengers);
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }
}
