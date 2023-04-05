package com.softserve.edu06.hw.Task1;

public class Penguin extends NotFlyingBird {
    private String penguinsBreed;

    protected Penguin() {

    }

    protected Penguin(String feathers, boolean layEggs, boolean canSwim, String penguinsBreed) {
        super(feathers, layEggs, canSwim);
        this.penguinsBreed = penguinsBreed;
    }

    public String getPenguinsBreed() {
        return penguinsBreed;
    }

    public void setPenguinsBreed(String penguinsBreed) {
        this.penguinsBreed = penguinsBreed;
    }

    public void fly() {
        System.out.println("Im penguin and i do not know how to fly");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "penguinsBreed='" + penguinsBreed + '\'' +
                ", canSwim=" + canSwim +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
