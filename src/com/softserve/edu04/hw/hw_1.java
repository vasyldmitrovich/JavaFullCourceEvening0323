import java.util.Scanner;

public class hw_1{
    public static void main(String[] args) {
    range.find();

    }
}class range{
    public  static void find(){

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

        for( int i = 0; i< arr.length; i++ ){
            if(arr[i]>-5 && arr[i]<5){
                x+=1;
            }
        }
        if (x==3){
            System.out.print("all numbers are in range");
        }else{
            System.out.print("one or more numbers not in range");
        }

    }
}