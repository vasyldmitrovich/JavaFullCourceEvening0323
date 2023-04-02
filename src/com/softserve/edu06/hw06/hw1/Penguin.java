package com.softserve.edu06.hw06.hw1;

public class Penguin extends NonFlyingBird {
    int yearsOfLiving;
    String species;

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getAreaOfLiving() {
        return areaOfLiving;
    }

    @Override
    public void setAreaOfLiving(String areaOfLiving) {
        this.areaOfLiving = areaOfLiving;
    }

    public Penguin(int yearsOfLiving, String species, String size, String areaOfLiving) {
        this.yearsOfLiving = yearsOfLiving;
        this.species = species;
        this.size = size;
        this.areaOfLiving = areaOfLiving;
    }

    public Penguin() {

    }

    @Override
    public String toString() {
        return "Penguin{" +
                "yearsOfLiving=" + yearsOfLiving +
                ", species='" + species + '\'' +
                ", size='" + size + '\'' +
                ", areaOfLiving='" + areaOfLiving + '\'' +
                '}';
    }
}
