package src.com.softserve.edu01.practic.taskOne;

import java.util.Scanner;

public class WorkWithString {
    private Scanner scanner = new Scanner(System.in);
    public void processWorkingWithString(){
        System.out.println("Input text:");
        String worldOneForRead = scanner.nextLine();
        String worldTwoForRead = scanner.nextLine();
        String worldThreeForRead = scanner.nextLine();
        processOutputString(worldOneForRead, worldTwoForRead, worldThreeForRead);
    }
    private void processOutputString(String worldForOutputThree, String worldForOutputTwo, String worldForOutputOne){
        System.out.println("Output text:");
        System.out.println(worldForOutputOne);
        System.out.println(worldForOutputTwo);
        System.out.println(worldForOutputThree);
    }
}
