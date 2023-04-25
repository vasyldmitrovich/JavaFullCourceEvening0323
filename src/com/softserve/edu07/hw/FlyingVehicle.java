package com.softserve.edu07.hw;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    public FlyingVehicle(int passengers){
        super(passengers);
    }

    public void fly(){}

    public void land(){}
}
