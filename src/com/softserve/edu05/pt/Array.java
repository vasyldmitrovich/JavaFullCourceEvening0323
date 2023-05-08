package com.softserve.edu05.pt;

import java.util.Scanner;
//Firth task

public class Array {
    /*Move this method  under the main method
    * And rename this method, because name of method can not start from upercase*/
    public int Avarage(int [] array) {
        /*Use reformat code because need add spaces before + and another operators*/
        int avereg  ;
        int sum=0;
        int k=1;

        for(int i = 0; i<array.length; i++ ) {
             sum= array[i]+sum;
             k++;
            }
             avereg=sum/k;
        return sum;
    }
    public static void main(String[] args) {

        /*Do not correct name of variable, must be from lowercase*/
        int Array[] = new int[10];// масиви
        for (int i = 0; i < Array.length; i++) {

            Scanner br = new Scanner(System.in);
            int a = br.nextInt();
            Array[i] = a;
        }
        Array br1 =new Array();

        System.out.println("Avarage the array is::"+br1.Avarage(Array)/Array.length);


        /*If next code is not needed then delete this code*/
        //Input
       /* for (int i = 0; i <Array.length; i++) {
            System.out.println(Array[i]);
             }*/

        //Sort
     /*   int tmp;
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] < Array[j]) {
                    tmp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }*/
    }


}







