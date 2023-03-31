package com.softserve.edu05.practic.taskTwo;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public Car(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        maxSpeed = 120;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public abstract String run();
    public abstract String stop();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getYearOfProduction() != car.getYearOfProduction()) return false;
        return getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        int result = getModel().hashCode();
        result = 31 * result + getYearOfProduction();
        return result;
    }
}
