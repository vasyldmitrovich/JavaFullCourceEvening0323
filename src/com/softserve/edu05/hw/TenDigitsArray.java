package com.softserve.edu05.hw;

import java.util.Scanner;

public class TenDigitsArray {
    private int[] numbers;

    public TenDigitsArray(){}

    public TenDigitsArray(int[] numbers){
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }

    public String calculate(){
        int result = 0;
        String explanation;
        for(int i = 0; i < 5; i++){
            if(numbers[i] < 0){
                result = 0;
                break;
            }
            result += numbers[i];
        }
        explanation = "The sum of first five numbers equals: ";
        if(result == 0){
            result = 1;
            for(int i = 5; i < numbers.length; i++){
                result *= numbers[i];
            }
            explanation = "The product of last five numbers equals: ";
        }
        return explanation + result;
    }
}
