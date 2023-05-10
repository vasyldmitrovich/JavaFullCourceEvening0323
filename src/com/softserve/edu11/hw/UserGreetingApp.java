package com.softserve.edu11.hw;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserGreetingApp {

    public static List<String> greetings = List.of("Hello, %s!", "Hi there! %s", "What's up, %s?",
            "Good morning, %s", "Good afternoon, %s", "Good evening, %s",
            "It's nice to meet you, %s", "It's a pleasure to meet you, %s",
            "How's it going, %s?", "Bonjour, %s!");
    public static final String regularExpression = "([a-zA-Z',.-]+( [a-zA-Z',.-]+)*){2,30}";

    public static void main(String[] args) {
        printUserGreeting();
    }

    public static void printUserGreeting() {
        Scanner scanner = new Scanner(System.in);
        Boolean isNameCorrect = false;
        int attempt = 1;
        do {
            System.out.printf("%d - Please, input user name: ", attempt);
            String userName = scanner.nextLine();
            if (userName.matches(regularExpression)) {
                System.out.printf(greetings.get(generateRandomNumber()), userName);
                isNameCorrect = true;
            } else {
                System.out.printf("User name is not valid! Try again\n");
            }
            attempt += 1;
        } while (!isNameCorrect || attempt > 10);
    }

    public static Integer generateRandomNumber() {
        Integer min = 0;
        Integer max = 10;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
