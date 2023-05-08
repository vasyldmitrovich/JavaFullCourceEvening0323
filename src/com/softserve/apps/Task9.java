package com.softserve.apps;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

    public class Task9 {
        public static void Random_counter() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many time do you want to random: ");
            int n = sc.nextInt();
            int counter = 0;
            ArrayList<Integer> myNumbers = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < n; i++) {
                int randomValue = ran.nextInt(2);
                if(randomValue == 1 ){
                    counter++;
                }

            }
            System.out.println("Amount of 1 is: "+counter);
        }


        public static void main(String[] args) {
        Random_counter();
        }

    }