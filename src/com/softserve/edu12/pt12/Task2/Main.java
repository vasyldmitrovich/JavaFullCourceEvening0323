package com.softserve.edu12.pt12.Task2;

public class Main {
    public static void main(String[] args) {
        Plant [] plants = new Plant[5];
        plants[0]= new Plant(1, Color.RED, new TypeException().checkType("CONIFEROUS"));
        plants[1]= new Plant(1, Color.RED, new TypeException().checkType("y"));
        plants[2]= new Plant(1, new ColorException().checkColor("RED"), Type.DECIDUOUS);
        plants[3]= new Plant(1, new ColorException().checkColor("h"), Type.CONIFEROUS);
        plants[4]= new Plant(1, Color.ROSE, Type.MIXED);
    }
}
