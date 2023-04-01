package com.softserve.edu06.pt06.pt03;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public  String toString() {
        return "("+this.x+","+this.y+")";
    }

    void print() {
        System.out.println(this.toString());
    }
}
