package com.softserve.edu07.hw07.task2;

public class Boat extends WaterVehicle{
int volume;

    public Boat(int passengers) {
        super(passengers);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    void isSailing() {
        super.isSailing();
    }
}
