package com.softserve.edu07.hw;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){}

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.printf("The helicopter took %d passengers, %dkg weight and raised on %dm height\n",getPassengers(),weight,maxHeight);
    }

    @Override
    public void land() {
        System.out.printf("Helicopter landed\n");
    }
}
