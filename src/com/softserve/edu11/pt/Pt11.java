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
        System.out.println("Please input the last name, first name, and middle name in line: ");
        //String fioString = input.nextLine();
        String fioString = "Gonchar Roman Sergeevich";
        System.out.println("FIO string: " + fioString);
        String pattern = "(\\b\\w+)+\\s+(\\b\\w+)+\\s+(\\b\\w+)";
        Pattern patfio = Pattern.compile(pattern);
        Matcher matcherfio = patfio.matcher(fioString);
        if (matcherfio.matches()) {
            System.out.println("First name: " + matcherfio.group(2));
            System.out.println("First name, middle name, last name: "
                    + matcherfio.group(2) + " "
                    + matcherfio.group(3) + " "
                    + matcherfio.group(1)
            );
        }

        String patternInitials = "(\\b\\w+)+\\s+(\\w)\\w+\\s+(\\w)";
        Pattern patInitials = Pattern.compile(patternInitials);
        Matcher matcherInitials = patInitials.matcher(fioString);
        if (matcherInitials.lookingAt()) {
            System.out.println("Last name and initials: " + matcherInitials.group(1) + " "
                    + matcherInitials.group(2) + ". "
                    + matcherInitials.group(3) + "."
            );
        }

        System.out.println("Task 3");
        List<String> userNames = Arrays.asList("user_1", "us", "asdfasdfasfsdfasfsdfsup3", "use.r", "userName");
        String patternUname = "\\w{3,15}";
        Pattern patUname = Pattern.compile(patternUname);
        for (String userName : userNames) {
            Matcher m = patUname.matcher(userName);
            System.out.println(userName + " " + m.matches());
        }
    }

    }
}
