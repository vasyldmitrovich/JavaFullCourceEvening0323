import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hw_3 {
    public static void main(String[] args){
    triangle.area();
    }
    class triangle{
            public static void area(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter side a: ");
                double a = sc.nextDouble();
                System.out.println("Enter side b: ");
                double b = sc.nextDouble();
                System.out.println("Enter side c: ");
                double c = sc.nextDouble();

                double p = (a+b+c)/2;

                double area = sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("The area of triangle = "+area);
            }
    }
}
