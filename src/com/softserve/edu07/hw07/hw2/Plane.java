package com.softserve.edu07.hw07.hw2;

public class Plane extends FlayingVehicle{
    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Plane(int passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void land() {

    }
}
