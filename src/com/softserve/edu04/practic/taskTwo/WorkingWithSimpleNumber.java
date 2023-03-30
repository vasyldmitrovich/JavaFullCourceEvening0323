package com.softserve.edu04.practic.taskTwo;

import java.math.BigInteger;
import java.util.Scanner;

public class WorkingWithSimpleNumber {
    private Scanner scanner = new Scanner(System.in);

    public void startWorkingWithNumbers() {
        System.out.print("Input please number:");
        int numberFromUser = scanner.nextInt();
        BigInteger bigIntegerForCheck = BigInteger.valueOf((long) (numberFromUser));
        System.out.println(checkNumberOnSimple(numberFromUser) == true ? "Is a prime number" : "Is not prime number");
    }

    public boolean checkNumberOnSimple(int numberFromUser) {
        int countDiv = 0;
        for(int i = 1; i<=numberFromUser; i++){
            if(numberFromUser % i == 0){
                countDiv++;
            }
        }
        return countDiv == 2 ?  true : false;
    }
}
