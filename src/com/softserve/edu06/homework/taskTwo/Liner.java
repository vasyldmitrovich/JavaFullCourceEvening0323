package com.softserve.edu06.homework.taskTwo;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    @Override
    public void isSailing() {
        System.out.println("I am Liner for water vehicle!");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
