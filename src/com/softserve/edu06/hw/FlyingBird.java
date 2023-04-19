package com.softserve.edu06.hw;

public class FlyingBird  extends Bird{
    @Override
    public void fly() {
        System.out.println("Can fly !");
    }

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}
