package com.softserve.edu07.hw;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }

    public GroundVehicle(int passengers){
        super(passengers);
    }

    public void drive(){}
}
