package com.softserve.edu06.pt03;

public class Line {
    Point start_point;
    Point end_point;

    Line(Point start_point, Point end_point) {
        this.start_point = start_point;
        this.end_point = end_point;
    }

    @Override
    public String toString() {
        return "Line: " + this.start_point.toString() + " - " + this.end_point.toString();
    }

    void print() {
        System.out.println(this.toString());
    }
}
