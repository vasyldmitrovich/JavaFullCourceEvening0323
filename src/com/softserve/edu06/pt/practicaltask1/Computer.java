package com.softserve.edu06.pt.practicaltask1;
//Task1
//uncomment code
public abstract class Computer {
    protected static String brand = "Generic";

    public abstract void turnOn();

    public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
