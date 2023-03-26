package src.com.softserve.edu03.practic.taskOne;

import java.util.Scanner;

public class ForWorkingWithNumbers {
    private Scanner scanner = new Scanner(System.in);
    public void workingWithNumbers(){
        System.out.println("Input first number");
        int numberOne = scanner.nextInt();
        System.out.println("Input second number");
        int numberTwo = scanner.nextInt();
        System.out.println("Input third number");
        int numberThree = scanner.nextInt();
        findOddFromThreeNumbers(numberOne,numberTwo,numberThree);
    }

    private int findOddFromThreeNumbers(int numberOne, int numberTwo, int numberThree){
        int countOdd = 0;
        countOdd += numberOne % 2 == 0 ? 1 : 0;
        countOdd += numberTwo % 2 == 0 ? 1 : 0;
        countOdd += numberThree % 2 == 0 ? 1 : 0;
        return countOdd;
    }
}
