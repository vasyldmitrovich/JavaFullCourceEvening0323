package com.softserve.edu06.pt;

public class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return ("This is point x=" + x + ", y=" + y);
    }

    public void print() {
        System.out.print(this.toString());
    }
}