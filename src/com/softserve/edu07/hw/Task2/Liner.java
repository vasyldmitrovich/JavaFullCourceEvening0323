package com.softserve.edu07.hw.Task2;

public class Liner extends WaterVehicle{
    private int floors;

    protected Liner(){
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    protected void isSailing() {
        System.out.println("I`m liner from water vehicle and i`m sailing");
    }

}
