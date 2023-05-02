package com.softserve.edu12.pt12.task2;

import static java.lang.System.out;

public class App {
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
        } catch (Plant.ColorException ce) {
            out.println(ce.getMessage());
        } catch (Plant.TypeException te) {
            out.println(te.getMessage());
        } catch (Plant.SizeException se) {
            out.println(se.getMessage());
        }
    }
}
