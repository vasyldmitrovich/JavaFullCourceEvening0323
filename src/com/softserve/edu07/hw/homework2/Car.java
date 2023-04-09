package com.softserve.edu07.hw.homework2;

public class Car extends GroundVehicle {

    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

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
        System.out.println(this + " is driving!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" +getPassengers() +
                ", model='" + model + '\'' +
                '}';
    }
}
