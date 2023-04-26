package com.softserve.edu12.pt;

import static com.softserve.edu12.pt.Color.*;
import static com.softserve.edu12.pt.Type.*;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        this.size = size;
        this.color = converteToColorEnum(color);
        this.type = converteToTypeEnum(type);
    }

    public Color converteToColorEnum(String color) throws ColorException {
        switch (color.toUpperCase()) {
            case "GREEN":
                return GREEN;
            case "WHITE":
                return WHITE;
            case "YELLOW":
                return YELLOW;
            case "RED":
                return RED;
            default:
                throw new ColorException("Error! No color!");
        }
    }

    public Type converteToTypeEnum(String type) throws TypeException {
        switch (type.toUpperCase()) {
            case "TREE":
                return TREE;
            case "FLOWER":
                return FLOWER;
            case "GRASS":
                return GRASS;
            default:
                throw new TypeException("Error! No type!");
        }
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
