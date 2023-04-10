package com.softserve.edu06.pt;

public class Sedan extends Car{
    public void run() {
        System.out.println("Engine is running");
    }


    public void Stop() {
        System.out.println("Engine is stopped");
    }

    public Sedan(String model, int Maxspeed, int YearOfProduction) {
        super(model, Maxspeed, YearOfProduction);
    }
}
