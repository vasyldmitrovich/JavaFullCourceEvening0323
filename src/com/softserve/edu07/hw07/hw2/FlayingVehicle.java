package com.softserve.edu07.hw07.hw2;

public abstract class FlayingVehicle extends Passengers implements Vehicle{

    public FlayingVehicle(int passengers) {
        super(passengers);
    }

    public abstract void fly();

    public abstract void land();
}
