package com.softserve.edu07.hw;

public class Car extends GroundVehicle{
    private String model;

    public Car(){}

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.printf("The %s is driving with %d passengers\n", model, getPassengers());
    }
}
