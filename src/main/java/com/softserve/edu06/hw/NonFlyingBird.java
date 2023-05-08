package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Я не можу літати!");
    }
}
