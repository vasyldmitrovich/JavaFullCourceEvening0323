package com.softserve.edu06.hw;

public class Swallow extends FlyingBird{
    public Swallow() {
    }

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "Swallow: " + super.fly();
    }
}
