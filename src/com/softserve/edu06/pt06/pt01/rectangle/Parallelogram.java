package com.softserve.edu06.pt06.pt01.rectangle;
public class Parallelogram extends Rectangle {
    private int angle;
    public int getArea() {
        return (int) (width * height * Math.sin(angle * Math.PI / 180));
    }
    public int getAngle() {
        return angle;
    }
    public void setAngle(int angle) {
        this.angle = angle;
    }
}