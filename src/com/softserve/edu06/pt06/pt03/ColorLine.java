package com.softserve.edu06.pt06.pt03;

public class ColorLine extends Line{
    String color;

    ColorLine(Point start_point, Point end_point, String color) {
        super(start_point, end_point);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine (" + this.color + "): " + this.start_point.toString() + " - " + this.end_point.toString();
    }

    void print() {
        System.out.println(this.toString());
    }
}
