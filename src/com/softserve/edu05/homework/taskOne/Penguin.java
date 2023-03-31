package com.softserve.edu05.homework.taskOne;

public class Penguin extends NotFlyingBird{
    public Penguin() {
    }

    public Penguin(String feathers) {
        super(feathers);
    }

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "I am penguin and i can not fly";
    }
}
