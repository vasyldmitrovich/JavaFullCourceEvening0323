package com.softserve.edu06.hw.Task1;

public abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird() {

    }

    public Bird(String feathers, boolean layEggs) {
        this.layEggs = layEggs;
        this.feathers = feathers;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
