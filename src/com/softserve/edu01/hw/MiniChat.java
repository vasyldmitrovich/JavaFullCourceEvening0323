package com.softserve.edu01.hw;

import java.util.Scanner;
public class MiniChat {
    public static void main(String[] args) {
        String name = getPrompt("What is your name?");
        String address = getPrompt("Where do you live, " + name + "?");

        System.out.println(name + " lives in " + address + ".");
    }

    static String getPrompt(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
