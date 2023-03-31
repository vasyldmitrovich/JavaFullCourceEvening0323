package com.softserve.edu05.homework.taskOne;

public class NotFlyingBird extends Bird{
    public NotFlyingBird() {
    }

    public NotFlyingBird(String feathers) {
        super(feathers);
    }

    public NotFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "I can not fly!";
    }
}
