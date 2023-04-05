package com.softserve.edu05.pt;


import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Pt_5_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //______1
        String[] array = {"Tesla", "BMW ", "Porsche ", "Volkswagen ", "AUDI "};
        Arrays.sort(array);
        System.out.println("Sorted list: " + Arrays.toString(array));

        //______2
        int[] array_2 = {1, 2, 3, 4, 5};
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array_2[i];
        }
        average = average / array.length;
        System.out.println("Average is: " + average);


        //______3
        System.out.println("You want to enter number or text: ");
        String ask = sc.nextLine();
        if (Objects.equals(ask, "text")) {
            System.out.println("Enter car mark: ");
            String search = sc.nextLine();
            for (String s : array) {
                if (Objects.equals(s, search)) {
                    System.out.println("The word is in array!");
                }


            }
        } else if (Objects.equals(ask, "number")) {
            System.out.println("Enter number: ");
            int search1 = sc.nextInt();
            for (int i : array_2) {
                if (i == search1) {
                    System.out.println("The number is in array!");
                }
            }
        }
    }
}


