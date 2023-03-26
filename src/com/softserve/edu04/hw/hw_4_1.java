import java.util.Scanner;

public class hw_4_1 {
    public static void main(String[] args){
    range.ranges();

    }

}
class range{
    public static void ranges(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-st number: ");
        double a = sc.nextDouble();
        System.out.println("Enter 2-nd number: ");
        double b = sc.nextDouble();
        System.out.println("Enter 3-d number: ");
        double c = sc.nextDouble();

        double arr[] = new double [3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int i = 0;

    for(int x = 0;x<arr.length;x++){
        if(arr[x]>(-5) && arr[x]<(5)){
            i+=1;
        }
    }
    if(i==3){
        System.out.println("All numbers are in range [-5;5]");
        }
    else{
        System.out.println("Not all numbers are in range [-5;5]");
    }

    }

}