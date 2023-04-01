package com.softserve.edu06.pt06.pt02;

public abstract class Car {
    private final String name;
    private final int maxSpeed;
    private final int yearOfProduction;

    public Car(String name, int maxSpeed, int yearOfProduction){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();
    public abstract void stop();
    public String getNameModel(){
        return name;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public int getYearOfProduction(){
        return yearOfProduction;
    }
}
