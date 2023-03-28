import java.util.Scanner;
public class TriangleAreaCalculator {
    static double a,b,c;
    public static void main(String[] args) {
        double s, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input side 1: ");
        a = sc.nextDouble();
        System.out.print("Input side 2: ");
        b = sc.nextDouble();
        System.out.print("Input side 3: ");
        c = sc.nextDouble();

        double maxValue = getMaxValue();
        if (a +b + c - maxValue > maxValue){
            s = (a + b + c) / 2;
            area = Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100) / 100d;
            System.out.println("The area of the triangle is: " + area);
        }

    }

    static double getMaxValue(){
        double maxValue = a;
        if (b > maxValue){
            maxValue = b;
        }
        if (c > maxValue){
            maxValue = c;
        }
        return maxValue;
    }
}
