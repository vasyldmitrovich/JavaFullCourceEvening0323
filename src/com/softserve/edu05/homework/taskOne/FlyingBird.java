package com.softserve.edu05.homework.taskOne;

public class FlyingBird extends Bird{
    public FlyingBird() {
    }

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public FlyingBird(String feathers) {
        super(feathers);
    }

    @Override
    public String fly() {
        return "I can fly!";
    }
}
