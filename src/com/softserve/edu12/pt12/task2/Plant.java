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

    // Main method
    public static void main(String[] args) {//Move main method to another class like App.java
        try {
            // Create an array of five plants
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(10, Color.RED, Type.FLOWER);
            plants[1] = new Plant(20, Color.GREEN, Type.TREE);
            plants[2] = new Plant(15, Color.BLUE, Type.SHRUB);
            plants[3] = new Plant(12, Color.YELLOW, Type.TREE);
            plants[4] = new Plant(30, null, Type.FLOWER); // This will throw an exception for invalid color value
            plants[4].verifyColorAndType(); // This will throw an exception for invalid color value
        } catch (ColorException ce) {
            out.println(ce.getMessage());
        } catch (TypeException te) {
            out.println(te.getMessage());
        } catch (SizeException se) {
            out.println(se.getMessage());
        }
    }
}
