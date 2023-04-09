package com.softserve.edu06.hw.birds;

public class NonflyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("Bird is not flying");
    }
}
