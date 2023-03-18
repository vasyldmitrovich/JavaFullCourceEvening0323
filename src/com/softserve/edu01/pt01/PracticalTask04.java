package edu01.pt1;

import java.util.Scanner;

/*
Output question "How are you?". Define string variable answer. Read the value answer and output: "You are (answer)".
 */
public class PracticalTask04 {
    public static void main(String[] args) {

        // create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // ask the user "How are you?" and read their answer
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        scanner.close();

        // output "You are (answer)"
        System.out.println("You are " + answer);
    }
}
