/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!On your computer
 * I do not see package in classes
 * PLEASE mark directory src in blue colour
 * because I must reformat package in each class */
import java.util.Scanner;

/*Do not correct name of class name must start from Uppercase letter*/
public class pt_1 {
    public static void main(String[] args) {
        odd.find();
    }
}

/*Each class should be in a separate file
* for you is needed only method, not another class*/
class odd{
    public static void find(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number -->  ");
        int a = sc.nextInt();
        System.out.print("Enter second number -->  ");
        int b = sc.nextInt();
        System.out.print("Enter third number -->  ");
        int c = sc.nextInt();

        int arr[]=new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int x = 0;

        for(int i=0; i<arr.length; i++) {
            if( arr[i]%2 == 0 ){
                x+=1;
            }
        }
        System.out.print("We have " + x + " odd");
    }
}