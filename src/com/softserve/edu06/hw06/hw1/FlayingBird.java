package com.softserve.edu06.hw06.hw1;

public class FlayingBird extends Bird {
    String size;
    String areaOfLiving;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAreaOfLiving() {
        return areaOfLiving;
    }

    public void setAreaOfLiving(String areaOfLiving) {
        this.areaOfLiving = areaOfLiving;
    }

    @Override
    public void fly() {
        System.out.println("I'm flying bird");
    }

    @Override
    public String toString() {
        return "FlayingBird{" +
                "size='" + size + '\'' +
                ", areaOfLiving='" + areaOfLiving + '\'' +
                '}';
    }
}
