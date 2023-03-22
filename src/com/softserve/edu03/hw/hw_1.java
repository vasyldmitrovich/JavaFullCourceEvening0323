import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hw_1{
    public static void main(String[] args) {
    triangle.area();

    }
}
class triangle{
    public static void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 side --->  ");
        double a = sc.nextDouble();
        System.out.println("Enter 2 side --->  ");
        double b  = sc.nextDouble();
        System.out.println("Enter 3 side --->  ");
        double c = sc.nextDouble();

        double p = (a+b+c)/2;
        double result = sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Your result is --->  "+ result);

    }
}