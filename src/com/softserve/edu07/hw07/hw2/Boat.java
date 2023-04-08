package com.softserve.edu07.hw07.hw2;

public class Boat extends WaterVehicle{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boat(int passengers) {
        super(passengers);
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing");
    }
}
