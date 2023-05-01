package com.softserve.edu07.hw.Hw_7_2;

public class Plane extends FlyingVehicles {
    private int maxDistance;

    public Plane(int maxDistance) {
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
        System.out.println("Can fly!");
    }

    @Override
    public void land() {
    System.out.println("Can be driven!");
    }
}
