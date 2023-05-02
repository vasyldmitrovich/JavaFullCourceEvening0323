package com.softserve.edu07.hw07.task2;

public class Helicopter extends FlyingVehicle{
    //Make fields private and add constructors, getters and setters
    private int weight;
    private int maxHeight;
    public Helicopter(int passengers) {
        super(passengers);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        super.fly();
    }

    @Override
    void land() {
        super.land();
    }
}
