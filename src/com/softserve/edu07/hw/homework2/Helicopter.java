package com.softserve.edu07.hw.homework2;

public class Helicopter extends FlyingVehicle {

    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println(this + " is flying");
    }

    @Override
    public void land() {
        System.out.println(this + " is landing");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "passengers=" + getPassengers() +
                ", weight=" + weight +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
