package com.softserve.edu05.hw;

import java.util.Scanner;

public class hw1Task3 {
    public void pos0fsec(int []array){
        int count=0;
        int k=0;
        for (int i = 0; i < 5; i++) {
            if(array[i]>0){
                count++;
                k=i+1;
                if(count==2){

         System.out.println(k);
                }
            }
        }
    }
    public  void min(int []arr){
        int min=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min ){
                min= arr[i];
                count=i+1;
            }
        }
      System.out.println("Min"+min);
        System.out.println("Position"+count);
    }
    public static void main(String[] args) {
    int Array[] = new int[5];// масиви
        System.out.println("Input Array");
        hw1Task3 obj=new hw1Task3();
        for (int i = 0; i < Array.length; i++) {
            Scanner br = new Scanner(System.in);
            int a = br.nextInt();
            Array[i] = a;
        }
       obj.pos0fsec(Array);
        obj.min(Array);

    }
}
