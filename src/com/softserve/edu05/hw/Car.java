package com.softserve.edu05.hw;

public class Car {
    private String Type;
    private int YearOfProduction;
    private int EngineCapacity;

    Car() {

    }

    Car(String type, int year, int engineCapacity) {
        Type = type;
        YearOfProduction = year;
        EngineCapacity = engineCapacity;
    }

    public String getType() {
        return Type;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }

    public int getEngineCapacity() {
        return EngineCapacity;
    }
}
