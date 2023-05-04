package com.softserve.edu11.homework.taskTwo;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with range!");
        for(int i = 0; i < 10; i++){
            System.out.print("Input number: ");
            int number = scanner.nextInt();
            try {
                readNumber(1,100,number);
            }catch (NumberNotInRangeException e){
                System.out.println(e.getMessage());
            }
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
