package com.softserve.edu11.practical.taskTwo;

public class Main {

    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        plants[0] = new Plant(Validation.checkSize(12), Validation.checkColor("BLUE"),Validation.checkType("CLIMBERS"));
        plants[1] = new Plant(Validation.checkSize(10), Validation.checkColor("BLACK"),Validation.checkType("SHRUBS"));
        plants[2] = new Plant(Validation.checkSize(5), Validation.checkColor("RED"),Validation.checkType("HERBS"));
        plants[3] = new Plant(Validation.checkSize(13), Validation.checkColor("GREEN"),Validation.checkType("SMALL"));
        plants[4] = new Plant(Validation.checkSize(25),Validation.checkColor("WHITE"), Validation.checkType("TREES"));
    }
}
