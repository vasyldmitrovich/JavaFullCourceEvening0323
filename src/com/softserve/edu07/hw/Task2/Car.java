package com.softserve.edu07.hw.Task2;

public class Car extends GroundVehicle{
    private String model;

    protected Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    protected void drive() {
        System.out.println("I`m car from ground vehicle and i can drive");
    }
}
