package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point startPosition, Point endPosition, String color) {
        super(startPosition, endPosition);
        this.color = color;
    }

    public void print(){
        System.out.println(toString());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}
