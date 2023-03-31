package com.softserve.edu05.homework.taskOne;

public class Eagle extends FlyingBird{
    public Eagle() {
    }

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Eagle(String feathers) {
        super(feathers);
    }

    @Override
    public String fly() {
        return "I am eagle and i can fly";
    }
}
