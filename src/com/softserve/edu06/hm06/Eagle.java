package com.softserve.edu06.hm06;

public class Eagle extends FlyingBird{

    protected Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    public void fly() {
        super.fly();
        System.out.println("This bird is an eagle.");
    }
}
