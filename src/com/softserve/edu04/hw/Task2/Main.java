package com.softserve.edu04.hw.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number");
        Integer[] nums = new Integer[3];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("Max number is: " + max +
                "\nMin number is: " + min);
    }
}
