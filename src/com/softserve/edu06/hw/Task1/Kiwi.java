package com.softserve.edu06.hw.Task1;

public class Kiwi extends NotFlyingBird {
    private String kiwisBreed;

    protected Kiwi() {

    }

    protected Kiwi(String feathers, boolean layEggs, boolean canSwim, String kiwisBreed) {
        super(feathers, layEggs, canSwim);
        this.kiwisBreed = kiwisBreed;
    }

    public String getKiwisBreed() {
        return kiwisBreed;
    }

    public void setKiwisBreed(String kiwisBreed) {
        this.kiwisBreed = kiwisBreed;
    }

    public void fly() {
        System.out.println("Im kiwi and i do not know how to fly");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "kiwisBreed='" + kiwisBreed + '\'' +
                ", canSwim=" + canSwim +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}