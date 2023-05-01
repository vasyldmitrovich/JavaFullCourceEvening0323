package com.softserve.edu07.hw;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }

    @Override
    public void land() {
        System.out.println("Can land");
    }
}
