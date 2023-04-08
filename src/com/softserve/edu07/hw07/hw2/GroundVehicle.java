package com.softserve.edu07.hw07.hw2;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive ();
}
