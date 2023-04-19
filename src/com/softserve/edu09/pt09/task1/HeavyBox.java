package com.softserve.edu09.pt09.task1;

public class HeavyBox {
    protected int weight;
    protected String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public String getContents() {
        return contents;
    }
}
