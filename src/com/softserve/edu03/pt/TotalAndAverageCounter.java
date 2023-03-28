import java.util.Scanner;
public class TotalAndAverageCounter {
    public static void main(String[] args) {
        int a = getNumber("first");
        int b = getNumber("second");

        System.out.println("The sum of " + a + " and " + b + " is " + getTotal(a, b));
        System.out.println("The average of " + a + " and " + b + " is " + getAverage(a, b));

    }

    static int getNumber(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the " + prompt + " number: ");

        return sc.nextInt();
    }

    static int getTotal(int a, int b){
        return a + b;
    }

    static double getAverage(int a, int b){
        return (double)getTotal(a, b) / 2;
    }
}
