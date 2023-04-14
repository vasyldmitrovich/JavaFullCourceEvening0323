package com.softserve.edu06.hw;

public abstract class Bird {
    private boolean feathers, layEggs;

    public Bird(){}

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String fly(){
        return null;
    }
}
