package src.com.softserve.edu01.homework.taskOne;

import java.util.Scanner;

public class WorkingWithCircle {
    private Scanner scanner = new Scanner(System.in);
    public void startWorking(){
        System.out.println("Choose operation:\n1)Found perimeter\n2)Found area");
        int chooseOperation = scanner.nextInt();
        switch (chooseOperation){
            case 1 -> foundAndOutputPerimeter(getRadiusCircleFromConsole());
            case 2 -> foundAndOutputArea(getRadiusCircleFromConsole());
            default -> throw new RuntimeException("Error after choose operation!");
        }
    }
    private double getRadiusCircleFromConsole(){
        System.out.println("Input please radius for circle:");
        return scanner.nextDouble();
    }
    private void foundAndOutputPerimeter(double radius){
        System.out.println("Perimeter circle = "+(2*3.14*radius));
    }
    private void foundAndOutputArea(double radius){
        System.out.println("Area circle = "+(3.14*(radius*radius)));
    }
}
