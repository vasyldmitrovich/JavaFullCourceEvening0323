package com.softserve.edu10.practical.taskTwo;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with FLM");
        System.out.println("Input your first, last and middle name across space");
        String fullName = scanner.nextLine();
        String[] arrayFullName = fullName.split(" ");
        if(arrayFullName.length == 3){
            System.out.println(arrayFullName[1]+" "+arrayFullName[0].charAt(0)+"."+arrayFullName[2].charAt(0)+".");
            System.out.println(arrayFullName[0]);
            System.out.println(arrayFullName[0]+" "+arrayFullName[2]+" "+arrayFullName[1]);
        }else{
            System.out.println("You wrong input");
        }
    }
}
