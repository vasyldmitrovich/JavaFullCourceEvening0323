package com.softserve.edu03.hw3;

public class SmallestNumber {
    int num1;
    int num2;
    int num3;

    public int smallestNumber(int num1, int num2, int num3){
        int min = num1; // записав у змінну
        if(num2<min){
            min = num2; // перезаписав змінну
        } if(num3<num2){
            min = num3; // перезаписав змінну
        }
        return min;
    }
}
