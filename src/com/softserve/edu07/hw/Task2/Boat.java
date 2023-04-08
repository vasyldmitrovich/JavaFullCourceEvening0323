package com.softserve.edu07.hw.Task2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    protected void isSailing() {
        System.out.println("I`m boat from water vehicle and i`m sailing");
    }
}
