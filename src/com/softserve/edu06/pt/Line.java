package com.softserve.edu06.pt;

public class Line {
    private Point point1, point2;

    public Line(){}

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public void setPoint1(Point point1){
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    @Override
    public String toString(){
        return "Line between point 1(" + point1.getX() + ";" + point1.getY() + ") and point 2("
                + point2.getX() + ";" + point2.getY() + ")";
    }
}
