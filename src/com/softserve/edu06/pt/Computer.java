package com.softserve.edu06.pt;

public abstract class Computer {
    static String brand = "Generic";

    public void turnOn() {
    }

    public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}

