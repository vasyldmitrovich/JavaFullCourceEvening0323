package com.softserve.edu06.pt.Pt_6_3;

import com.softserve.edu06.pt.Pt_6_3.Line;
import com.softserve.edu06.pt.Pt_6_3.Point;

class ColorLine extends Line {
    private String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "startPoint=" + getStartPoint() +
                ", endPoint=" + getEndPoint() +
                ", color='" + color + '\'' +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}
