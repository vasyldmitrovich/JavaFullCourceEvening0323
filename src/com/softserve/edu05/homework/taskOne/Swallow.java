package com.softserve.edu05.homework.taskOne;

public class Swallow extends FlyingBird{
    public Swallow() {
    }

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Swallow(String feathers) {
        super(feathers);
    }

    @Override
    public String fly() {
        return "I am swallow and i can fly!";
    }
}
