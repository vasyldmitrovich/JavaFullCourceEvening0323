package com.softserve.edu05.hw;

import java.util.Scanner;

public class task2 {
    public int FTrue(int[] array) {
int count=0;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if(array[i]>0){
                count++;
            }

        }
        if(count==5) {
            for (int i = 0; i < 5; i++) {

                sum = array[i] + sum;

            }
        }
            return sum;

        }



        public int LTrue(int[] array) {
            int count=0;
            int product = 1;
            for (int i = 5; i < 10; i++) {
                if(array[i]<0){
                    count++;
                }
            }
            if(count==5) {
            for (int i = 5; i < 10; i++) {

                    product = array[i] * product;


            }
            }
            return product;

        }

    public static void  output(int k){
        if(k!=0){
            System.out.println("Resalt is "+k);
        }
    }


    public static void main(String[] args) {
        int z=0;
        task2 obj=new task2();
    int Array[] = new int[10];// масиви
        for (int i = 0; i < Array.length; i++) {

            Scanner br = new Scanner(System.in);
            int a = br.nextInt();
            Array[i] = a;
        }

        int k=obj.FTrue(Array);
        int k1=obj.LTrue(Array);
        output(k);
        output(k1);



    }
}
