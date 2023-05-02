package com.softserve.edu10.homework.taskThree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {//Good
        System.out.println("Task with format Dollar");
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        System.out.println("Input please sentence");
        String sentence = scanner.nextLine();
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
