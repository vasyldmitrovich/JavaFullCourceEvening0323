package com.softserve.edu03.homework.taskThree;

import java.util.Scanner;

public class WorkingWithEnumHttpError {
    private final Scanner scanner = new Scanner(System.in);
    public void processWorking(){
        System.out.print("Input please code error: ");
        int codeFromUser = scanner.nextInt();
        App app = new App();
        app.foundHttpError(codeFromUser);
    }
}
