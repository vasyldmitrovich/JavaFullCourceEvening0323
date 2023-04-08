package com.softserve.edu07.hw07.hw2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driveng");
    }
}
