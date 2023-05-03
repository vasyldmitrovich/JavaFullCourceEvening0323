package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pt11 {
    public static void main(String[] args){
        System.out.println("Task 1");
        Scanner input = new Scanner(System.in);
//        System.out.print("Please input first string: ");
//        String firstString = input.nextLine();
//        System.out.print("Please input second string: ");
//        String secondString = input.nextLine();
//        Pattern p = Pattern.compile(firstString);
//        Matcher m = p.matcher(secondString);
//        String result = m.find() ? "String 2 contain string 1" : "String 2 does not contain string 1";
//        System.out.println(result);

        System.out.println("Task 2");
        System.out.print("Please input the last name, first name, and middle name in line: ");
        //String fioString = input.nextLine();
        String fioString = "Gonchar Roman Sergeevich";
        String pattern = "\\b\\w+.\\b\\w+.\\b\\w+";
        Pattern patfio = Pattern.compile(pattern);
        Matcher matcherfio = patfio.matcher(fioString);
        if (matcherfio.matches()) {
            System.out.println(matcherfio.group(0));
        }

    }
}
