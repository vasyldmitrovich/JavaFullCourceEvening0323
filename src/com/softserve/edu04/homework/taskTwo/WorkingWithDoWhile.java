package src.com.softserve.edu04.homework.taskTwo;

import java.util.Scanner;

public class WorkingWithDoWhile {
    private Scanner scanner = new Scanner(System.in);
    public void startWorking(){
        String chooseOperation;
        do{
            System.out.print("Input first number: ");
            int numberOne = scanner.nextInt();
            System.out.print("Input second number: ");
            int numberTwo = scanner.nextInt();
            System.out.println("Their sum = "+(numberOne+numberTwo));
            System.out.println("You want repeat operation? Input yes or no: ");
            chooseOperation = scanner.next();
        }while (chooseOperation.equals("yes"));
    }
}
