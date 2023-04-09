package com.softserve.edu06.hw.birds;

public class Swallow extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("Swallow is flying");
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
