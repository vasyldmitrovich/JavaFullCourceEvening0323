package com.softserve.edu06.pt06.pt01.shape;

public class Parallelogram extends edu06.shape.Shape {
    private final int width;
    private final int height;
    private final int angle;

    public Parallelogram(int width, int height, int angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return (width * height * Math.sin(angle * Math.PI / 180));
    }
}