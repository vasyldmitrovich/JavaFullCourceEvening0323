import java.util.Arrays;
import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args){
        numb.size();
    }
}

class numb{
    public static void size(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number --> ");
        int a = sc.nextInt();
        System.out.print("Enter second number --> ");
        int b = sc.nextInt();
        System.out.print("Enter third number -->  ");
        int c = sc.nextInt();

        double arr[] = new double[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int x = 0;

        System.out.println("Max number is -- >  " + Arrays.stream(arr).max());
        System.out.println("Min number is -->  " + Arrays.stream(arr).min());
    }
}