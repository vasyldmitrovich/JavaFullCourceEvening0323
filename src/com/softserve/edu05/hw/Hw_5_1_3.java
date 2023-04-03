package com.softserve.edu05.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hw_5_1_3 {
    public static void main(String[] args){
    Position_Min_Even();
    }


    public static void Position_Min_Even(){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList());
        /*Adding to list*/
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + " number: ");
            int input = sc.nextInt();
            list.add(input);
        }
        /* Find the position of second positive number*/
        int counter_of_positive = 0;
        for(int i = 0;i<5;i++){
            if(list.get(i) > 0){
                counter_of_positive +=1;
                if(counter_of_positive == 2){
                    System.out.println("Second positive number is "+list.get(i)+" and it`s position is: "+(i+1));

                }
                }
            }
        if(counter_of_positive < 2) {
            System.out.println("There is less than 2 positive numbers");
        }


        /*Min value and it`s position*/
        int min = list.get(0);
        int position = 0;
        for(int i = 0;i<5;i++){
            if(list.get(i) < min){
                min  = list.get(i);
                position = i;
            }

        }
        System.out.println("Min: "+min+" and it`s position: "+(position));


        int product = 1;
        for(int i = 0;i<5;i++ ){
            if(list.get(i) % 2 == 0){
                product *=list.get(i);


            }
        }
        System.out.println("The product is: "+product);





    }
}
