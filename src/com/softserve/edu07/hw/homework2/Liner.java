package com.softserve.edu07.hw.homework2;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner() {
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println(this + " is sailing ~~~");
    }

    @Override
    public String toString() {
        return "Liner{" +
                "passengers=" + getPassengers() +
                ", floors=" + floors +
                '}';
    }
}
