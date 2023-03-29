package com.softserve.edu01.pt01;
 
import java.util.Scanner;

public class PracticalTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi user! Enter first variable 'a'");
        int a = sc.nextInt();
        System.out.println("Enter first variable 'b'");
        int b = sc.nextInt();
        System.out.println("Enter operation, that you would like to do: '+'or'-'or'*'or'/'");
        String c = sc.next();
        switch (c){
            case("+"):
                System.out.println(a+b);
                break;
            case ("-"):
                System.out.println(a-b);
                break;
            case("*"):
                System.out.println(a*b);
                break;
            case ("/"):
                System.out.println(a/b);
                break;
        }

    }
}
