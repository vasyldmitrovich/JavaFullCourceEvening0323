package com.softserve.edu07.hw07.task2;

public class Car extends GroundVehicle{
    String model;
    public Car(int passengers) {
        super(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        super.drive();
    }
}
