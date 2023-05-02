package com.softserve.edu11.homework.taskTwo;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with range!");
        for(int i = 0; i < 10; i++){
            System.out.print("Input number: ");
            int number = scanner.nextInt();
            readNumber(1,100,number);//Add try catch there, and handle this error here if it occurs
        }
    }

    public static int readNumber(int start, int finish, int number){
        if(number >= start && number <= finish){
            return number;
        }else {
            throw new NumberNotInRangeException("Number not in range!");
        }
    }
}
