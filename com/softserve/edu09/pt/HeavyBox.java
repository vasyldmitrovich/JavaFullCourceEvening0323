package com.softserve.edu09.pt;

public class HeavyBox {
    int weight;
    String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString(){
        String s = "Weight: " + this.weight + ", Contents: " + this.contents;
        return s;
    }
}
