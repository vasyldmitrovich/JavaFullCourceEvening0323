package com.softserve.edu06.pt;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel(){
        return model;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getYearOfProduction(){
        return yearOfProduction;
    }

    public void run(){}

    public void stop(){}

    public String toString(){
        return "";
    }
}
