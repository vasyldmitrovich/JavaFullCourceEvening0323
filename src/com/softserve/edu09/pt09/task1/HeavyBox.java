package com.softserve.edu09.pt09.task1;

public class HeavyBox {
    //Why access modifier is protected, use principe less access, make field private, only if it is necessary add another access modifier
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
