package com.softserve.edu06.homework.taskTwo;

public class Car extends GroundVehicle{
    private String model;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("I am car and i can ride!");
    }
}
