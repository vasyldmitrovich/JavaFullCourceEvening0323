package com.softserve.edu07.hw.Task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    protected Helicopter() {
    }

    @Override
    protected void fly() {
        System.out.println("I`m helicopter from flying vehicle and i can fly");
    }

    @Override
    protected void land() {
        System.out.println("I`m helicopter from flying vehicle and i don`t know what is land");
    }
}
