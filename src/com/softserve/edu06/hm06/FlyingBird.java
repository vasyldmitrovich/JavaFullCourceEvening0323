package com.softserve.edu06.hm06;

public class FlyingBird extends Bird{

    protected FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird is flying.");
    }
}
