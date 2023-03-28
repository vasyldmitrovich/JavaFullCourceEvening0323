import java.util.Scanner;
public class MinValue {
    public static void main(String[] args) {
        int n1,n2,n3,minValue;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        n1 = sc.nextInt();
        System.out.print("Input the second number: ");
        n2 = sc.nextInt();
        System.out.print("Input the third number: ");
        n3 = sc.nextInt();

        minValue = n1;
        if(n2 < minValue){
            minValue = n2;
        }
        if(n3 < minValue){
            minValue = n3;
        }

        System.out.print("The smallest number is: " + minValue);
    }
}
