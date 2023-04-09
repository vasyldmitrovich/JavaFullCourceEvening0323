package com.softserve.edu07.hw.homework2;

public abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
