import java.util.Scanner;

public class hw_3_2 {
    public static void main(String[] args){
    smallest.small();
    }
    class smallest{
        public static void small(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First number ");
            double a = sc.nextDouble();
            System.out.println("Enter Second number ");
            double b = sc.nextDouble();
            System.out.println("Enter Third number ");
            double c = sc.nextDouble();

            if(a<b && a<c){
                System.out.println("The smallest is "+a);
            }
            else if(c<b && c<a){
                System.out.println("The smallest is "+c);
            }
            else if(b<c && b<a){
                System.out.println("The smallest is "+b);
            }
            else {
                System.out.println("Two or more numbers are the same");
            }

        }
    }
}
