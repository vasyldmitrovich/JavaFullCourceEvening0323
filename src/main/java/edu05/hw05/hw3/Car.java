package edu05.hw05.hw3;

public class Car {
    String type;
    int yearOfProduction;
    int engineCapasity;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapasity=" + engineCapasity +
                '}';
    }

    public Car(String type, int yearOfProduction, int engineCapasity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapasity = engineCapasity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapasity() {
        return engineCapasity;
    }

    public void setEngineCapasity(int engineCapasity) {
        this.engineCapasity = engineCapasity;
    }
}
