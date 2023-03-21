package src.com.softserve.edu02.homework.taskOne;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input side 1: ");
        int sideOne =  scanner.nextInt();
        System.out.print("Input side 2: ");
        int sideTwo =  scanner.nextInt();
        System.out.print("Input side 3: ");
        int sideThree =  scanner.nextInt();
        WorkingWithTriangle workingWithTriangle = new WorkingWithTriangle();
        System.out.println("The area of the triangle is "+workingWithTriangle.foundAreaTriangle(sideOne,sideTwo,sideThree));
    }
}
