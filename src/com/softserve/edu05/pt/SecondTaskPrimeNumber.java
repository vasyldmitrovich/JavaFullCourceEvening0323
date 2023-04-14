package com.softserve.edu05.pt;
import java.util.Scanner;

public class SecondTaskPrimeNumber {
    public static void main(String[] args) {
        int number = getNumber("Input the number: ");
        System.out.println(checkThePrime(number)? "Is a prime number": "Is not prime number");

    }

    static int getNumber(String message){
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    static boolean checkThePrime(int number){
        boolean result = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
}
