package com.softserve.edu06.hw.Task1;

public class Swallow extends FlyingBird {
    private String swallowBreed;

    protected Swallow() {

    }

    protected Swallow(String feathers, boolean layEggs, boolean areTheyMigrating, String swallowBreedBreed) {
        super(feathers, layEggs, areTheyMigrating);
        this.swallowBreed = swallowBreedBreed;
    }

    public String getSwallowBreed() {
        return swallowBreed;
    }

    public void setSwallowBreed(String swallowBreed) {
        this.swallowBreed = swallowBreed;
    }

    public void fly() {
        System.out.println("Im swallow and i know how to fly");
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "swallowBreed='" + swallowBreed + '\'' +
                ", areTheyMigrating=" + areTheyMigrating +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
