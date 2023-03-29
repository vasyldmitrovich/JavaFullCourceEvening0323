package com.softserve.edu01.homework.taskTwo;

import java.util.Scanner;

public class WorkingWithUserNameAndAddress {
    private Scanner scanner = new Scanner(System.in);

    public void processWorkingWithUser() {
        System.out.println("What is your name?");
        String nameUser = scanner.nextLine();
        System.out.println("Where do you live, " + nameUser + ".");
        String addressUser = scanner.nextLine();
        System.out.println("All information:\nname = " + nameUser + "\naddress = " + addressUser);
    }
}
