package com.softserve.edu07.hw.homework2;

public class Boat extends WaterVehicle {

    private int volume;

    public Boat() {
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println(this + " is sailing ~~~~~");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "passengers=" + getPassengers() +
                ", volume=" + volume +
                '}';
    }
}
