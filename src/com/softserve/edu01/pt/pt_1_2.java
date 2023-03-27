import java.util.Scanner;

public class pt_1_2 {
    public static void main(String[] args){
    average.aver();
    }
}
class average{
    public static void aver(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-st number");
        double a = sc.nextDouble();
        System.out.println("Enter 2-nd number");
        double b = sc.nextDouble();
        System.out.println("Enter 3-d number");
        double c = sc.nextDouble();

        System.out.println((a+b+c)/3);
    }

}