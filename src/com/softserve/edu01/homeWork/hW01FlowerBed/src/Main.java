import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input the radius:");

        double radius = Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.println("The perimeter equals: " + (Math.PI * 2 * radius));
        System.out.println("The radius equals: " + (Math.PI * Math.pow(radius, radius)));
    }
}
