package com.softserve.edu06.hw06.hw1;

public class NonFlyingBird extends Bird {
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
        System.out.println("I'm not flying bird");
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "size='" + size + '\'' +
                ", areaOfLiving='" + areaOfLiving + '\'' +
                '}';
    }
}
