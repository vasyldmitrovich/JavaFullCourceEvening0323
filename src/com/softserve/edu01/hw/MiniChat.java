import java.util.Scanner;
public class MiniChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = sc.nextLine();

        System.out.println(name + " lives in " + address + ".");
    }
}
