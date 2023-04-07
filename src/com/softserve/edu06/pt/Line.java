package com.softserve.edu06.pt;

public class Line {
    private Point startPosition;
    private Point endPosition;

    public Line(Point startPosition, Point endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public void print() {
        System.out.println(toString());
    }

    public Point getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Point startPosition) {
        this.startPosition = startPosition;
    }

    public Point getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Point endPosition) {
        this.endPosition = endPosition;
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPosition=" + startPosition +
                ", endPosition=" + endPosition +
                '}';
    }
}
