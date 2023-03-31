package com.softserve.edu05.homework.taskOne;

public abstract class Bird {
    private String feathers;
    private boolean layEggs;
    public abstract String fly();

    public Bird() {
    }

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public Bird(String feathers) {
        this.feathers = feathers;
        layEggs = true;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird bird)) return false;

        if (isLayEggs() != bird.isLayEggs()) return false;
        return getFeathers().equals(bird.getFeathers());
    }

    @Override
    public int hashCode() {
        int result = getFeathers().hashCode();
        result = 31 * result + (isLayEggs() ? 1 : 0);
        return result;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
