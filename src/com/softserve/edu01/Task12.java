package com.softserve.edu01;

public class Task12 {
    public static int sumOfAllTheMultiples (){
        int sum = 0;
        for (int i = 1; i < 1000; i++){
            if  (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }


        return sum;
    }
}
