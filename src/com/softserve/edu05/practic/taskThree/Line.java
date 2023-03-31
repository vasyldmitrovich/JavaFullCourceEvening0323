package com.softserve.edu05.practic.taskThree;

public class Line {
    private Point pointOne;
    private Point pointTwo;

    public Line() {
    }

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Line(Point pointOne) {
        this.pointOne = pointOne;
        pointTwo = new Point(100,100);
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

    @Override
    public String toString() {
        return "Line{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                '}';
    }
    public String print(){
        return "I am line and i have coordinate point one = "+pointOne+" point two = "+pointTwo;
    }
}
