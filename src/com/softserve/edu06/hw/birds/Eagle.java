package com.softserve.edu06.hw.birds;

public class Eagle extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
