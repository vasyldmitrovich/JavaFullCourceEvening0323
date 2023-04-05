package com.softserve.edu06.pt.Task3;

public class Line {
    private Point pointOne;
    private Point pointTwo;

    protected Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    protected Line() {

    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    protected void print() {
        System.out.println("I`m line " + pointOne + " " + pointTwo);
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                '}';
    }
}
