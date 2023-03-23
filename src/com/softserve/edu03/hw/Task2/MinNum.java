package com.softserve.edu03.hw.Task2;

import java.util.Scanner;

public class MinNum {
    private int firstNum;
    private int secondNum;
    private  int thirdNum;

    public MinNum(){
        firstNum = 0;
        secondNum = 0;
        thirdNum =0;
    }
    public MinNum(int firstNum, int secondNum, int thirdNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }
    public void setFirstNum(int firstNum){this.firstNum = firstNum;}
    public void setSecondNum(int secondNum){this.secondNum = secondNum;}
    public void setThirdNum(int thirdNum){this.thirdNum = thirdNum;}
    public int getFirstNum(){return firstNum;}
    public int getSecondNum(){return secondNum;}
    public int getThirdNum(){return thirdNum;}

    public int minNum(){
        int[] num = {firstNum, secondNum, thirdNum};
        int min = num[0];
        for (int i = 1; i < num.length; i++){
            if (min < num[i]) {
                min = i;
            }
        }
        return min;
    }
    public void inputNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        firstNum = scanner.nextInt();
        System.out.print("Input the second number: ");
        secondNum = scanner.nextInt();
        System.out.print("Input the third number: ");
        thirdNum = scanner.nextInt();
    }
}
