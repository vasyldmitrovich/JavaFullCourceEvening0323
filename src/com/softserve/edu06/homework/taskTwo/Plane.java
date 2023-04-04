package com.softserve.edu06.homework.taskTwo;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane() {
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("I am plane and i can fly!");
    }

    @Override
    public void land() {
        System.out.println("I am plane and i can not driving on land!");
    }
}
