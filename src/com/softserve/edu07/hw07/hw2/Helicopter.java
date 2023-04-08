package com.softserve.edu07.hw07.hw2;

public class Helicopter extends FlayingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void land() {

    }
}
