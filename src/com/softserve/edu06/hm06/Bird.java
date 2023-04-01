package com.softserve.edu06.hm06;

public abstract class Bird {
    private final String feathers;
    private final boolean layEggs;

    protected Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }


    public abstract void fly();

    public String isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }
}
