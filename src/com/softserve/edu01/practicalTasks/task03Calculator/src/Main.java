import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Input value of a variable:");
        a = Integer.parseInt(sc.next());
        System.out.println("Input value of b variable:");
        b = Integer.parseInt(sc.next());

        System.out.println("Choose the operation (input the sign)");
        String sign = sc.next();

        switch (sign){
            case "+":
                addition(a, b);
                break;
            case "-":
                subtraction(a, b);
                break;
            case "*":
                multiplication(a, b);
                break;
            case "/":
                division(a, b);
                break;
        }
    }

    static void addition (int a, int b){
        System.out.println(a + " + " + b + " = " + a + b);
    }

    static void subtraction (int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    static void multiplication (int a, int b){
        System.out.println(a + " * " + b + " = " + a * b);
    }

    static void division (double a, int b){
        double result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }
}
