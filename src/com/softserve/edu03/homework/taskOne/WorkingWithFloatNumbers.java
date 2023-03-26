package src.com.softserve.edu03.homework.taskOne;

import java.util.Scanner;

public class WorkingWithFloatNumbers {
    private Scanner scanner = new Scanner(System.in);
    public void processWorkingWithFloatNumbers(){
        System.out.println("Input first number");
        float numberOne = scanner.nextFloat();
        System.out.println("Input second number");
        float numberTwo = scanner.nextFloat();
        System.out.println("Input third number");
        float numberThree = scanner.nextFloat();
        String resultCheck = checkFloatNumbersInRange(numberOne, numberTwo,numberThree) ? "All numbers enter in range":"not all numbers enter in range";
        System.out.println(resultCheck);
    }
    private boolean checkFloatNumbersInRange(float numberOne, float numberTwo, float numberThree){
        return numberOne >= -5 && numberOne <= 5 ? numberTwo >= -5 && numberTwo <= 5 ? numberThree >= -5 && numberThree <= 5 ? true : false : false : false;
    }
}
