package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("Can't fly !");
    }
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}
