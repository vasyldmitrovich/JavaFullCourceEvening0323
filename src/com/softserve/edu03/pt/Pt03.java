package src.com.softserve.edu03.pt;

import java.util.Scanner;

public class Pt03 {
    public static void main(String[ ] args) {
/********************** PART I **********************/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        getTotal(a,b);
        getAverage(a,b);

        System.out.print("Enter prompt: ");
        Scanner prmt = new Scanner(System.in);
        String prompt = prmt.nextLine();
        getNumber(prompt);

/********************** PART II **********************/

        Employee man1 = new Employee("Vasia",2,3);
        Employee man2 = new Employee("Orest",2,3);
        Employee man3 = new Employee("Miko",2,3);

        System.out.println("getSalary: " + man1.getSalary());
        System.out.println("getBonuses: " + man1.getBonuses());
        System.out.println("TotalSum: " + Employee.getTotalSum());
    }

    private static void getAverage(int a, int b) {
        System.out.println("Avarage: " + ((double)(a+b)/2));
    }

    private static void getTotal(int a, int b) {
        System.out.println("Total: " + (a+b));
    }

    private static void getNumber(String prompt) {
        Scanner prt = new Scanner(System.in);
        System.out.print("First " + prompt + ":");
        int a = prt.nextInt();
        System.out.print("Second " + prompt + ":");
        int b = prt.nextInt();
        getTotal(a,b);
        getAverage(a,b);

    }


}
