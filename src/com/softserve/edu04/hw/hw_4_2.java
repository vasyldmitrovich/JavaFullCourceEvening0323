import java.util.Arrays;
import java.util.Scanner;

public class hw_4_2 {
    public static void main(String[] args){
        Num.nums();

    }
}
class Num{
    public static void nums(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2-nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3-d number: ");
        int c = sc.nextInt();

        int arr[] = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int i = 0;

        System.out.println("Max number is: "+Arrays.stream(arr).max());
        System.out.println("Min number is: "+Arrays.stream(arr).min());

    }

}