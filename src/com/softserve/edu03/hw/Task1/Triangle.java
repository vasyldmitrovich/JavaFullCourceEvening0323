package com.softserve.edu03.hw.Task1;

import java.util.Scanner;

public class Triangle {
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public Triangle(){
        sideOne = 0;
        sideTwo = 0;
        sideThree = 0;
    }
    public Triangle(int a, int b, int c){
        sideOne = a;
        sideTwo = b;
        sideThree = c;
    }
    public void setSideOne(int side){sideOne = side;}
    public void setSideTwo(int side){sideTwo = side;}
    public void setSideThree(int side){sideThree = side;}
    public int getSideOne(){return sideOne;}
    public int getSideTwo(){return sideTwo;}
    public int getSideThree(){return sideThree;}
    public void inputSides(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side one: ");
        sideOne = scanner.nextInt();
        System.out.print("Enter side two: ");
        sideTwo = scanner.nextInt();
        System.out.print("Enter side three: ");
        sideThree = scanner.nextInt();
    }
    public boolean ifExist(){
        return sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne && sideThree + sideOne > sideTwo;
    }
    public double area(){
        double sp = (sideOne + sideTwo + sideThree) / 2.0;
        return Math.sqrt(sp * (sp - sideOne)*(sp - sideTwo)*(sp - sideThree));
    }

}
