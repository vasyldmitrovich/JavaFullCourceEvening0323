package com.softserve.edu06.hw.Task1;

public abstract class NotFlyingBird extends Bird {
    protected boolean canSwim;

    protected NotFlyingBird() {

    }

    protected NotFlyingBird(String feathers, boolean layEggs, boolean canSwim) {
        super(feathers, layEggs);
        this.canSwim = canSwim;

    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return "NotFlyingBird{" +
                "canSwim=" + canSwim +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
