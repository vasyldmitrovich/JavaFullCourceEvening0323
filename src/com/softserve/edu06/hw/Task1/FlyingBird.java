package com.softserve.edu06.hw.Task1;

public abstract class FlyingBird extends Bird {
    protected boolean areTheyMigrating;

    protected FlyingBird() {

    }

    protected FlyingBird(String feathers, boolean layEggs, boolean areTheyMigrating) {
        super(feathers, layEggs);
        this.areTheyMigrating = areTheyMigrating;
    }

    public boolean isAreTheyMigrating() {
        return areTheyMigrating;
    }

    public void setAreTheyMigrating(boolean areTheyMigrating) {
        this.areTheyMigrating = areTheyMigrating;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "areTheyMigrating=" + areTheyMigrating +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
