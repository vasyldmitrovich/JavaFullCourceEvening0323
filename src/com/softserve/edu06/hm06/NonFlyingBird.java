package com.softserve.edu06.hm06;

public class NonFlyingBird extends Bird{

    protected NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird cannot fly.");
    }
}
