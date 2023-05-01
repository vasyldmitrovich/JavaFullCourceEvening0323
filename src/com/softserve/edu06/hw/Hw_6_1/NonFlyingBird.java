package com.softserve.edu06.hw.Hw_6_1;

public class NonFlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("This bird cannot fly.");
    }
}