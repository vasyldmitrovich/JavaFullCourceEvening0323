package com.softserve.edu07.hw.homework2;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane() {
    }

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
        System.out.println(this + " is flying ^^^");
    }

    @Override
    public void land() {
        System.out.println(this + " is landing ...");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "passengers=" + getPassengers() +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
