package com.softserve.edu06.hw;

public class Eagle extends FlyingBird{
    public Eagle() {
    }

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "Eagle: " + super.fly();
    }
}
