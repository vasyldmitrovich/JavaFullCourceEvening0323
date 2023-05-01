package com.softserve.edu07.hw.Hw_7_2;

public class Car extends GroundVehicle{

    private String model;
    public Car(String model) {
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

            System.out.println("Can be driven");

    }
}
