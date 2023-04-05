package com.softserve.edu06.pt.Task3;

public class ColorLine extends Line {
    private String color;

    protected ColorLine(Point pointOne, Point pointTwo, String color) {
        super(pointOne, pointTwo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void print() {
        System.out.println("I`m color line " + getPointOne() + " " + getPointTwo() + " and my color is " + color);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}
