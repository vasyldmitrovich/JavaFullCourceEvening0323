package com.softserve.edu08.practical.taskTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input set numbers");
        String setNumbers = scanner.nextLine();
        //Good
        Arrays.stream(setNumbers.split(" ")).distinct().map((s -> s.replace(',',' '))).forEach(System.out::print);
    }
}
