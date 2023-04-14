package com.softserve.edu05.hw;

import java.util.Comparator;

public class Car implements Comparable{
    private TypesOfCars type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(){}

    public Car(TypesOfCars type, int yearOfProduction, double engineCapacity){
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public void setType(TypesOfCars type) {
        this.type = type;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public TypesOfCars getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;
        return Integer.compare(yearOfProduction, car.yearOfProduction);
    }

    @Override
    public String toString() {
        return "car type: " + type.toString() + "; year of production: " + yearOfProduction;
    }

    public static class CarsByYear implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Car car1 = (Car) o1;
            Car car2 = (Car) o2;

            return Integer.compare(car1.getYearOfProduction(), car2.getYearOfProduction());
        }
    }
}
