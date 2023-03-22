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
        int a = sc.nextInt();
        System.out.println("Enter second number -->  ");
        int b = sc.nextInt();
        System.out.println("a + b  ---> " +(a+b));
        System.out.println("a - b  ---> " + (a-b));
        System.out.println("a * b  ---> " + (a*b));
        System.out.println("a / b  ---> " + (a/b));
    }
}
