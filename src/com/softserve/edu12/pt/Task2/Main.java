package com.softserve.edu12.pt.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {//Ok
        try {
            Plant[] plants = {
                    new Plant(1,colorSet("RED"), typeSet("BUSH")),
                    new Plant(2,colorSet("BLUE"), typeSet("FLOWER")),
                    new Plant(3,colorSet("GREEN"), typeSet("TREE")),
                    new Plant(4,colorSet("RED"), typeSet("FLOWER")),
                    new Plant(11,colorSet("BLUE1"), typeSet("BUSH1")),
            };
            System.out.println(Arrays.toString(plants));
        } catch (SizeException | ColorException | TypeException e) {
            e.printStackTrace();
        }
    }
    private static Color colorSet (String color) throws ColorException {
        try {
            return Color.valueOf(color);
        } catch (IllegalArgumentException e){
            throw new ColorException("Invalid color");
        }
    }

    private static Type typeSet (String type) throws TypeException {
        try {
            return Type.valueOf(type);
        } catch (IllegalArgumentException e) {
            throw new TypeException("Invalid type");
        }
    }
}
