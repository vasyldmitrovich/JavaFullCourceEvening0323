package com.softserve.edu05.practic.taskThree;

public class ColorLine extends Line{
    private Color color;

    public ColorLine() {
    }

    public ColorLine(Point pointOne, Point pointTwo, Color color) {
        super(pointOne, pointTwo);
        this.color = color;
    }

    public ColorLine(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo);
        color  = Color.BLUE;
    }

    public ColorLine(Point pointOne, Color color) {
        super(pointOne);
        this.color = color;
    }

    @Override
    public String print() {
        return "I am line and i have coordinate point one = "+getPointOne()+" point two = "+getPointTwo()+" and color = "+color.name();
    }
}
