package com.softserve.edu11.practical.taskTwo;

public class Validation {

    public static int checkSize(int size) throws PlantSizeException {
        if (size <= 5 || size >= 20) {
            if (size < 5) throw new PlantSizeException("Size for plant is small");
            if (size > 20) throw new PlantSizeException("Size for plant is bigger");
        }
        return size;
    }

    public static Type checkType (String typeInString) throws TypeException {
        try {
            return Type.valueOf(typeInString);
        } catch (IllegalArgumentException e){
            throw new TypeException("Invalid value "+typeInString);
        }
    }

    public static Color checkColor (String colorInString) throws ColorException {
        try {
            return Color.valueOf(colorInString);
        } catch (IllegalArgumentException e){
            throw new ColorException("Invalid value "+colorInString);
        }
    }
}
