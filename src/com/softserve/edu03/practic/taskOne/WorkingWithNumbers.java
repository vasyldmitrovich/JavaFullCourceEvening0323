/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!On your computer
 * how I see
 * folder JavaFullCourceEvening0323 marked blue
 * PLEASE mark directory src in blue colour
 * because I must reformat in each class package*/
package com.softserve.edu03.practic.taskOne;

import java.util.Scanner;

/*Do class name a little shorter */
public class WorkingWithNumbers {
    private Scanner scanner = new Scanner(System.in);

    public void processWorkingWithNumbers() {
        System.out.println("Input first number");
        int numberOne = scanner.nextInt();
        System.out.println("Input second number");
        int numberTwo = scanner.nextInt();
        System.out.println("Input third number");
        int numberThree = scanner.nextInt();
        /*I do not see on screen result this method, please add print with message for user*/
        System.out.println("count odd numbers = "+findOddFromThreeNumbers(numberOne, numberTwo, numberThree));
    }

    private int findOddFromThreeNumbers(int numberOne, int numberTwo, int numberThree) {
        int countOdd = 0;
        countOdd += numberOne % 2 == 0 ? 1 : 0;
        countOdd += numberTwo % 2 == 0 ? 1 : 0;
        countOdd += numberThree % 2 == 0 ? 1 : 0;
        return countOdd;
    }
}
