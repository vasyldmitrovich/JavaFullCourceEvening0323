package com.softserve.edu10.homework.taskFour;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task with star");
        String pattern = "^[A-Za-z\\s-]+$";
        System.out.println("Input your name");
        String nameUser = scanner.nextLine();
        while (true){
            System.out.println("Input please sentence");
            String sentence = scanner.nextLine();
            if(sentence.matches(pattern)){
                System.out.println("You good input sentence!");
                System.out.println(generateGreeting(nameUser));
                break;
            }else{
                System.out.println("Repeat please!");
            }
        }
    }

    public static String generateGreeting(String name){
        return "Hello "+name+", We very glad see you in our app";
    }
}
