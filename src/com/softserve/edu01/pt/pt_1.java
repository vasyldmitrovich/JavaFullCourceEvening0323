import java.util.Scanner;

public class pt_1 {

    public static void main(String[] args){
        pract_1.numbers();
    }



    }
    class pract_1 {
        public static void numbers() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            double a = sc.nextDouble();
            System.out.println("Enter b: ");
            double b = sc.nextDouble();
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
        }
    }

