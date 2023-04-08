package com.softserve.edu07.hw.Task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    protected Plane() {
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    protected void fly() {
        System.out.println("I`m plane from flying vehicle and i can fly");
    }

    @Override
    protected void land() {
        System.out.println("I`m helicopter from flying vehicle and i can drive on land");
    }
}
