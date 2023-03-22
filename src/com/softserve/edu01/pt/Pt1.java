package src.com.softserve.edu01.pt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pt1 {
    public static void main(String[ ] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();

    }

    private static void taskFour() {
        String answer;
        System.out.println("How are you?");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        System.out.println("You are " + answer);
    }

    private static void taskThree() {
        int a=0,b=0;
        System.out.println("Enter int a: ");
        try{
            Scanner sc= new Scanner(System.in);
            a= sc.nextInt();
        }catch(InputMismatchException e) {
            System.err.println("This is not integer");
            System.out.println("Default value '0' of int 'a' will be used.");
        }
        System.out.println("Enter int b: ");
//        int b = bb.getInt();
        try{
            Scanner sc= new Scanner(System.in);
            b= sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println(b + " is not integer");
            System.out.println("Default value '0' of int 'b' will be used.");
        }
        System.out.println(a + "  " + b);
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        String result = (b!=0) ? ("a/b=" + (a/b)) : ("b is 0, can't devide by 0");
        System.out.println(result);
    }

    private static void taskTwo() {
        int line1,line2,line3;
        System.out.println("Input first number:");
        Scanner sc = new Scanner(System.in);
        line1 = sc.nextInt();
        System.out.println("Input second number:");
        line2 = sc.nextInt();
        System.out.println("Input third number:");
        line3 = sc.nextInt();
        System.out.println("Avarage is:" + ((double)(line1+line2+line3)/3));
    }

    private static void taskOne() {
        String line1,line2,line3;
        System.out.println("Input text (3 lines)");
        Scanner sc = new Scanner(System.in);
        line1 = sc.nextLine();
        line2 = sc.nextLine();
        line3 = sc.nextLine();
        System.out.println("Output text:");
        System.out.println(line3);
        System.out.println(line2);
        System.out.println(line1);
    }
}
