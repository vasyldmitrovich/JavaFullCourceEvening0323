package com.softserve.edu06.pt06.pt3;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" + "pont1=" + getPoint1() + "point2=" + getPoint2() +
                "color='" + color + '\'' +
                '}';
    }

    public void print(ColorLine colorLine) {
        System.out.println("Print " + colorLine);
    }
}
