package com.softserve.edu06.pt;

public abstract class Car {
    //Make variable private, and add constructor where you will get data and set to variables
    String model;
    int maxSpeed;
    int yearOfProduction;


    public abstract void run();

    public abstract void stop();
}
