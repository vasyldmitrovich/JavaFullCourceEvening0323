package com.softserve.edu06.pt;

public class Sedan extends Car{

    int numberOfSeats;

    public Sedan(String model, int maxSpeed, int yearOfProduction, int numberOfSeats){
        super(model, maxSpeed, yearOfProduction);
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public void run() {
        super.run();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public String toString(){
        return "Sedan car " + super.getModel() + "; year of production: " + super.getYearOfProduction()
                + "; max speed: " + super.getMaxSpeed() + "km/hour; number of seats: " + numberOfSeats;
    }
}
