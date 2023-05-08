package com.softserve.edu06.pt;

public class LaptopComputer extends Computer {
    @Override
    public void turnOn() {
        System.out.println("Turning on laptop computer...");
    }

    public void bootUp() {
        System.out.println("Boot up on laptop computer...");
    }
}
