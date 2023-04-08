package com.softserve.edu07.hw07.task2;

public class Plane extends FlyingVehicle{
    int maxDistance;
    public Plane(int passengers) {
        super(passengers);
    }

    @Override
    void fly() {
        super.fly();
    }

    @Override
    void land() {
        super.land();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
