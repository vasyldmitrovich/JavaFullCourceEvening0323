package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyFormatApp {

    public static void main(String[] args) {
        findCurrencyOccurrencesInText();
    }

    public static void findCurrencyOccurrencesInText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input sentence: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{0,2}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        };
    }
}
