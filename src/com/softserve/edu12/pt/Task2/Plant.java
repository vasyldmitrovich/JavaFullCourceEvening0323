package com.softserve.edu12.pt.Task2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant() {
    }

    public Plant(int size, Color color, Type type) throws SizeException {
        if (size < 1 || size > 10){
            throw new SizeException("Size out of range 1 - 10");
        } else {
            this.size = size;
        }
        this.color = color;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
