package com.softserve.edu10.practical.taskThree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {//Good
        System.out.println("Task with check username");
        for(int i=0; i < 5; i++){
            System.out.println("Input please username for "+i+" element");
            String username = scanner.nextLine();
            if(checkUsername(username)){
                System.out.println(username+" is a valid username");
            }else{
                System.out.println(username+" is NOT a valid username");
            }
        }
    }

    private static boolean checkUsername(String username){
        String regex = "^[a-zA-Z0-9_]{3,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
