package src.com.softserve.edu04.practic.taskTwo;

import java.math.BigInteger;
import java.util.Scanner;

public class WorkingWithSimpleNumber {
    private Scanner scanner = new Scanner(System.in);
    public void startWorkingWithNumbers(){
        System.out.print("Input please number:");
        int numberFromUser = scanner.nextInt();
        BigInteger bigIntegerForCheck = BigInteger.valueOf((long)(numberFromUser));
        System.out.println(checkNumberOnSimple(numberFromUser,bigIntegerForCheck) == true ? "Is a prime number" : "Is not prime number");
    }
    private boolean checkNumberOnSimple(int numberFromUser, BigInteger bigIntegerForCheck){
         return bigIntegerForCheck.isProbablePrime(numberFromUser);
    }
}
