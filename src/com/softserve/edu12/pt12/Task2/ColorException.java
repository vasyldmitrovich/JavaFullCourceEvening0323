package com.softserve.edu12.pt12.Task2;

public class ColorException {

    public Color checkColor (String a){
        try {
            return Color.valueOf(a);
        } catch (IllegalArgumentException e){
            throw new RuntimeException("Invalid value"+a);
        }
    }
}
