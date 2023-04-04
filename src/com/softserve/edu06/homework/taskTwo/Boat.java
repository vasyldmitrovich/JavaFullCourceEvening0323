package com.softserve.edu06.homework.taskTwo;

public class Boat extends WaterVehicle {
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
    public void isSailing() {
        System.out.println("I am boat for water vehicle!");
    }
}
