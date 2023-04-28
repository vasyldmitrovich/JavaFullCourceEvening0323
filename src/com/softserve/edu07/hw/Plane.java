package com.softserve.edu07.hw;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(){}

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.printf("The plane with %d passengers is flying to %d km\n",getPassengers(),maxDistance);
    }

    @Override
    public void land() {
        System.out.printf("The plane has landed successfully\n");
    }
}
