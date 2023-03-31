package com.softserve.edu06.pt01;
//slide 08
public class Rectangle {
    private int width;
    private int height;

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

