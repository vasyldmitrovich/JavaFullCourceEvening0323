package src.com.softserve.edu03.hw;

import java.util.Scanner;

public class Triangle {
    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input side 1: ");
        int a = sc.nextInt();
        System.out.print("Input side 2: ");
        int b = sc.nextInt();
        System.out.print("Input side 3: ");
        int c = sc.nextInt();
        System.out.println("The area of triangle is: " + getArea(a,b,c) );
        System.out.print("Min side is: " + getMin(a,b,c) );
    }

/************* Part I *************/
    private static double getArea(int a, int b, int c){
        double p = (a+b+c)/2.0;
        double s = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        return (s);
    }
    /************* Part II *************/
    private static int getMin(int a, int b, int c){
        int min = a;
        if(b<a & b<c){
            min = b;
        } else if (c<b & c<a) {
            min=c;
        }
        return min;
    }

}
