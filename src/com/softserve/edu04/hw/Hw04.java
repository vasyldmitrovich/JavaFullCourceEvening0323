package src.com.softserve.edu04.hw;

import java.util.Scanner;

public class Hw04 {
    public static void main(String[ ] args) {
        //hw1();
        //hw2();
        //hw3();
        //hw4();
        //hw5();
    }

    private static void hw2() {
        Scanner inInt = new Scanner(System.in);
        System.out.println("Please input 3 integer numbers: ");
        int a = inInt.nextInt();
        int b = inInt.nextInt();
        int c = inInt.nextInt();
        int min=a,max=a;

        if (b<min){
            if(b<c){
                min=b;
            }else{
                min=c;
            }
        }
        if (b>max){
            if(b>c){
                max=b;
            }else{
                max=c;
            }
        }
        System.out.println("Max: " + max + "\r\n" + "Min: " + min);
    }

    private static void hw1() {
        Scanner inFloat = new Scanner(System.in);
        System.out.println("Please input 3 float numbers: ");
        float a = inFloat.nextFloat();
        float b = inFloat.nextFloat();
        float c = inFloat.nextFloat();
        if (a>-5.0f && a<5.0f && b>-5.0f && b<5.0f && c>-5.0f && c<5.0f){
            System.out.print("All values are in range -5..5");
        }else{
            System.out.println("Some values are out of the range -5..5");
        }
    }

//    enum HTTPError {
//        400,
//        401,
//        402
//    }
}
