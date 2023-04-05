package com.softserve.edu06.hw.Task1;

public class Eagle extends FlyingBird {
    private String eaglesBreed;

    protected Eagle() {

    }

    protected Eagle(String feathers, boolean layEggs, boolean areTheyMigrating, String eaglesBreed) {
        super(feathers, layEggs, areTheyMigrating);
        this.eaglesBreed = eaglesBreed;
    }

    public String getEaglesBreed() {
        return eaglesBreed;
    }

    public void setEaglesBreed(String eaglesBreed) {
        this.eaglesBreed = eaglesBreed;
    }

    @Override
    public void fly() {
        System.out.println("Im eagle and i know how to fly");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "eaglesBreed='" + eaglesBreed + '\'' +
                ", areTheyMigrating=" + areTheyMigrating +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
