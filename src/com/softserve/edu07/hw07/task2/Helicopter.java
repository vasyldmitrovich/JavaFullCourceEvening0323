package com.softserve.edu07.hw07.task2;

public class Helicopter extends FlyingVehicle{
    //Make fields private and add constructors, getters and setters
    int weight;
    int maxHeight;
    public Helicopter(int passengers) {
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
}
