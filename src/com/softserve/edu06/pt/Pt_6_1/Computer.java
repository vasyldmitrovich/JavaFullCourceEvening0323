package com.softserve.edu06.pt.Pt_6_1;

abstract class Computer {
    static String brand = "Generic";

    public abstract void turnOn();

    public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
