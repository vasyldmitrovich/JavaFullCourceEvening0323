package com.softserve.edu10.practical.taskOne;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Practical task one");
        System.out.println("Input please first str");
        String strOne = scanner.nextLine();
        System.out.println("Input please two str");
        String strTwo = scanner.nextLine();
        System.out.println(checkSubstringTwoStr(strOne,strTwo) == true ? "Yes" : "No");//Del == true, this is not needed
    }

    private static boolean checkSubstringTwoStr(String strOne, String strTwo){
        return strTwo.contains(strOne);
    }
}
