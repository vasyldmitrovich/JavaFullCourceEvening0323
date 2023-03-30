package com.softserve.edu01.practic.taskOne;

import java.util.Scanner;

public class WorkWithString {
    private Scanner scanner = new Scanner(System.in);

    public void processWorkingWithString() {
        System.out.println("Input text:");
        String worldOneForRead = scanner.nextLine();
        String worldTwoForRead = scanner.nextLine();
        String worldThreeForRead = scanner.nextLine();
        System.out.println(processGetFinalString(worldOneForRead, worldTwoForRead, worldThreeForRead));
    }

    public String processGetFinalString(String worldForOutputThree, String worldForOutputTwo, String worldForOutputOne) {
        return "Output text:"+"\n"+worldForOutputOne +"\n"+ worldForOutputTwo+"\n"+worldForOutputThree;
    }
}
