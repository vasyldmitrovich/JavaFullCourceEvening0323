import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c1, c2, c3;
        int t1, t2, t3;
        double b1, b2, b3;

        System.out.println("Conversation #1");
        System.out.print("Cost per minute: ");
        c1 = Double.parseDouble(sc.next());
        System.out.print("Duration in minutes: ");
        t1 = sc.nextInt();
        b1 = calculateTheCost(c1, t1);
        System.out.println("Bill #1: " + b1 + "$");

        System.out.println("Conversation #2");
        System.out.print("Cost per minute: ");
        c2 = Double.parseDouble(sc.next());
        System.out.print("Duration in minutes: ");
        t2 = sc.nextInt();
        b2 = calculateTheCost(c2, t2);
        System.out.println("Bill #1: " + b2 + "$");

        System.out.println("Conversation #3");
        System.out.print("Cost per minute: ");
        c3 = Double.parseDouble(sc.next());
        System.out.print("Duration in minutes: ");
        t3 = sc.nextInt();
        b3 = calculateTheCost(c3, t3);
        System.out.println("Bill #1: " + b3 + "$");

        System.out.println("TOTAL: " + (b1 + b2 + b3) + "$");

    }

    static double calculateTheCost(double c, int t){
        return c * t;
    }
}
