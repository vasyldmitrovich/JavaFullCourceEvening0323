package com.softserve.edu07.hw07.hw2;

public class Car extends GroundVehicle{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(int passengers) {
        super(passengers);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
