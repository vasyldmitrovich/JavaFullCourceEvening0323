package com.softserve.edu12.pt12.task2;

import static java.lang.System.*;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    // ColorException class
    public static class ColorException extends Exception {
        public ColorException(String message) {
            super(message);
        }
    }

    // TypeException class
    public static class TypeException extends Exception {
        public TypeException(String message) {
            super(message);
        }
    }

    // SizeException class
    public static class SizeException extends Exception {
        public SizeException(String message) {
            super(message);
        }
    }

    // Constructor
    public Plant(int size, Color color, Type type) throws ColorException, TypeException, SizeException {
        setSize(size);
        setColor(color);
        setType(type);
    }

    // Getter methods
    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    // Setter methods with exception handling
    public void setSize(int size) throws SizeException {
        if (size < 1 || size > 100) {
            throw new SizeException("Invalid size value. Size should be between 1 and 100.");//Good
        }
        this.size = size;
    }

    public void setColor(Color color) throws ColorException {
        if (color == null) {
            throw new ColorException("Invalid color value");
        }
        this.color = color;
    }

    public void setType(Type type) throws TypeException {
        if (type == null) {
            throw new TypeException("Invalid type value");
        }
        this.type = type;
    }

    // Overridden toString() method
    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    // Method to verify size
    public void verifySize() throws SizeException {
        if (size < 10 || size > 50) {
            throw new SizeException("Invalid size. Size should be between 10 and 50.");
        }
    }

    // Method to verify color and type
    public void verifyColorAndType() throws ColorException, TypeException {
        if (color == null) {
            throw new ColorException("Invalid color value");
        }
        if (type == null) {
            throw new TypeException("Invalid type value");
        }
    }
}
