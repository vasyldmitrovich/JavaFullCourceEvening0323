package com.softserve.edu06.hm06;

public class Swallow extends FlyingBird{

    protected Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        super.fly();
        System.out.println("This bird is a swallow.");
    }

}
