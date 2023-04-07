package com.softserve.edu06.hw;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Куди полетимо?");
    }
}
