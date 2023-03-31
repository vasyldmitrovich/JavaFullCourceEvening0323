package com.softserve.edu04.pt;
/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!On your computer
 * maybe each package is marked blue
 * PLEASE mark directory src in blue colour
 * because I must reformat in each class package*/
import java.util.Scanner;

/*Do not correct name of class, read java code convention*/
public class Pt_4_2 {
    public static void main(String[] args){
        System.out.println("Enter number of day (1,2...7): ");
        Scanner sc = new Scanner(System.in);
        /*If variable day is not use then delete this variable*/

        int input  = sc.nextInt();
        switch (input){
            case 1:
                System.out.println( "Monday/Понеділок ");
                break;
            case 2:
                System.out.println( "Tuesday/Вівторок ");
                break;
            case 3:
                System.out.println( "Wednesday/Середа ");
                break;
            case 4:
                System.out.println( "Thursday/Четвер ");
                break;
            case 5:
                System.out.println("Friday/П’ятниця ");
                break;
            case 6:
                System.out.println( "Saturday/Субота ");
                break;
            case 7:
                System.out.println( "Sunday/Неділя ");
                break;
            default:
                System.out.println( "You entered wrong number!");
                break;

        }
    }
}
