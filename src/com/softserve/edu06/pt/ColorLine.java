package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private String color;

    public ColorLine() {}

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + "; color: " + color;
    }
}
