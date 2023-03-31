package com.softserve.edu05.practic.taskTwo;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public String run() {
        return "I starting run on Sedan";
    }

    @Override
    public String stop() {
        return "I stopped on Sedan";
    }
}
