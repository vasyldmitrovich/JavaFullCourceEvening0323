package com.softserve.edu06.pt;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point FirstPoint, Point SecondPoint, String color) {
        super(FirstPoint, SecondPoint);
        this.color = color;
    }

    public String toString() {
        return super.toString() + " color --> " + color;
    }

    public void print() {
        System.out.println(toString());
    }

}
