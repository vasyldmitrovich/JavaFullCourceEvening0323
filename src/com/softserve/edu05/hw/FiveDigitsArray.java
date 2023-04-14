package com.softserve.edu05.hw;
import java.util.Scanner;

public class FiveDigitsArray {
    private int[] numbers;

    public FiveDigitsArray(){}

    public FiveDigitsArray(int[] numbers){
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }

    public int getPositionOfSecondPositive(){
        int counter = 0;
        int index = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] >= 0){
                counter++;
                if(counter == 2){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public String getMinimumValue(){
        int minValue = numbers[0];
        int index = 0;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
                index = i;
            }
        }
        return minValue + "[" + index + "]";
    }

    public int getProductOfEven(){
        int product = 0;
        for(int i : numbers){
            if(i > 0){
                product *= i;
            }
        }
        return product;
    }

}
