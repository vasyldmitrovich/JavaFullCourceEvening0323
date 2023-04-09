package com.softserve.edu06.pt.pointline;

public class ColorLine extends Line{
    private String color;

    public ColorLine() {
    }

    public ColorLine(String color) {
        this.color = color;
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                super.toString() +
                ", color='" + color + '\'' +
                '}';
    }
}
