import java.util.Scanner;

public class pt_Main{
    public static void main(String[] args) {
        num.numbers();

    }
}


class num {
    public static void numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number -->  ");
        double a = sc.nextDouble();
        System.out.println("Enter second number -->  ");
        double b = sc.nextDouble();
        System.out.println("a + b  ---> " +(a+b));
        System.out.println("a - b  ---> " + (a-b));
        System.out.println("a * b  ---> " + (a*b));
        System.out.println("a / b  ---> " + (a/b));
    }
}
