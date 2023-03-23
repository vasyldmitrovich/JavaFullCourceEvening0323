package com.softserve.edu03.hw.Task2;

public class Main {
    public static void main(String[] args){
        MinNum minNum = new MinNum();
        minNum.inputNum();
        System.out.println("The smallest number is: " + minNum.minNum());
    }
}
