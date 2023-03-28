/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!On your computer
 * how I see
 * folder JavaFullCourceEvening0323 marked blue
 * PLEASE mark directory src in blue colour
 * because I must reformat package in each class*/
package src.com.softserve.edu04.pt;

import java.util.Scanner;

/*It is not good name of class*/
public class Pt04 {
    public static void main(String[ ] args) {
        /*Why you commented this method, when i run main method i do not see anything*/
    //pt1();
    //pt2();
    //pt3();
    //pt4();
    //pt5();
        /*Next variables is not using, if you create its then use they or remove from main method*/
        Product potato = new Product("potato", 2.60, 200 );
        Product onion = new Product("onion", 1.50, 100 );
        Product apple = new Product("apple", 0.60, 300 );
        Product kiwi = new Product("kiwi", 3.70, 500 );



    }

    /*What next three methods make???*/
    private static void pt5() {


    }

    private static void pt4() {
        System.out.println("Class Product has been created.");
    }

    private static void pt3() {
    }

    private static void pt2() {
        Scanner weekday = new Scanner(System.in);
        System.out.println("Please input day number(1-7): ");
        int day = weekday.nextInt();
        switch(day){
            case 1:
                System.out.print("Monday, Понеділок");
                break;
            case 2:
                System.out.print("Tuesday, Вівторок");
                break;
            case 3:
                System.out.print("Wednesday, Середа");
                break;
            case 4:
                System.out.print("Thursday, Четвер");
                break;
            case 5:
                System.out.print("Friday, П'ятниця");
                break;
            case 6:
                System.out.print("Saturday, Субота");
                break;
            case 7:
                System.out.print("Sunday, Неділя");
                break;
            default:
                System.out.print("That's something new...");
        }
        
    }
    private static void pt1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 3 integer numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count=0;
        /*Change this variable to StringBuilder it will be correct decision*/
        String output="";
        if(a%2!=0){
            count++;
            output= new StringBuilder().append(output).append("a ").toString();

        }
        if(b%2!=0){
            count++;
            output= new StringBuilder().append(output).append("b ").toString();
        }
        if(c%2!=0){
            count++;
            output= new StringBuilder().append(output).append("c ").toString();
        }
        System.out.println("Total of odd numbers: " + count + ". List of numbers: " + output + ".");
    }

    /*Move this class in another file, each class must be in unique file like Product.java
    * It is not good put many classes in one file in one class
    *
    * You should have two files for example: Product.java and App.java in App class write main method
    * and all another method*/
    public static class Product{
        /*Field must be private*/
        String name;
        double price;
        int quantity;

        public Product(){}
        public Product(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity=quantity;
        }


        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

}
