package com.softserve.edu07.hw;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(){}

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
        System.out.printf("%d passengers are riding a bike. Max speed is %dkm/h\n", getPassengers(), maxSpeed);
    }
}
