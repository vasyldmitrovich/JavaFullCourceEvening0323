package com.softserve.edu06.homework.taskTwo;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    @Override
    public void fly() {
        System.out.println("I am helicopter and i can fly!");
    }

    @Override
    public void land() {
        System.out.println("I am helicopter and i can not driving on land!");
    }
}
