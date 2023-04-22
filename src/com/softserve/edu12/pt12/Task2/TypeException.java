package com.softserve.edu12.pt12.Task2;

public class TypeException {

    public Type checkType (String a){
        try {
            return Type.valueOf(a);
        } catch (IllegalArgumentException e){
            throw new RuntimeException("Invalid value"+a);
        }
    }
}
