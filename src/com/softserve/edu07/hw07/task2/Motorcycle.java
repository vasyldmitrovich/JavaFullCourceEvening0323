package com.softserve.edu07.hw07.task2;

public class Motorcycle extends GroundVehicle{
    int maxSpeed;
    public Motorcycle(int passengers) {
        super(passengers);
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
    void drive() {
        super.drive();
    }
}
