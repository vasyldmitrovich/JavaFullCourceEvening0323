package com.softserve.edu06.hw.birds;

public abstract class Bird {

    protected int feathers;
    protected int layEggs;

    public Bird() {
    }

    public Bird(int feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public int getFeathers() {
        return feathers;
    }

    public void setFeathers(int feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    //Add worlds public and abstract not needed because java add this words by default
    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
