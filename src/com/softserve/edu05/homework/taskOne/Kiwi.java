package com.softserve.edu05.homework.taskOne;

public class Kiwi extends NotFlyingBird{
    public Kiwi() {
    }

    public Kiwi(String feathers) {
        super(feathers);
    }

    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "I am kiwi and i can not fly";
    }
}
