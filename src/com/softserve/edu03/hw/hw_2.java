import java.util.Scanner;

public class hw_2{
    public static void main(String[] args) {
        number.smallest();

    }
}

class number{
    public static void smallest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number --> ");
        int a = sc.nextInt();
        System.out.println("Enter second number --> ");
        int b = sc.nextInt();
        System.out.println("Enter third number -->  ");
        int c = sc.nextInt();

        if (a<b && a<c){
            System.out.println("The smalles number is -->  " + a);
        }
        else if (b<a && b<c){
            System.out.println("The smalles number is -->  " + b);
        }else if(c<a && c<b){
            System.out.println("The smalles number is --> " + c);
        }else{
            System.out.println("Maybe you enter two or three same numbers ???");
        }

    }
}
