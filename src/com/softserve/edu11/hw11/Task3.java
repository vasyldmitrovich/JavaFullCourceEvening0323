package com.softserve.edu11.hw11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sentence");
        String sentence = sc.nextLine();
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}

