package com.softserve.edu07.hw.homework2;

public abstract class GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
