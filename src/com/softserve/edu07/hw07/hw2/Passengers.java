package com.softserve.edu07.hw07.hw2;

public abstract class Passengers {
    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Passengers(int passengers) {
        this.passengers = passengers;
    }
}
