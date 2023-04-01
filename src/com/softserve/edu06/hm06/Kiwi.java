package com.softserve.edu06.hm06;

public class Kiwi extends NonFlyingBird{
    protected Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        super.fly();
        System.out.println("This bird is a kiwi.");
    }
}
