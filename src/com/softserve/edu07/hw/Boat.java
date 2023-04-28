package com.softserve.edu07.hw;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(){}

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
        System.out.printf("%d passengers are sailing on a %d-seat boat\n",getPassengers(),volume);
    }
}
