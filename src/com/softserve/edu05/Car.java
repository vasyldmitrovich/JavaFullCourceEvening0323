package com.softserve.edu05;

import java.util.Arrays;

public class Car {


   private String  type;
   private int yeaproduction;
    private  int enginecapacity;

    public Car(String  type,int yeaproduction, int enginecapacity){
        this.type=type;
        this.yeaproduction=yeaproduction;
        this.enginecapacity=enginecapacity;
    }
    public static void sort(int []arr){
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public int getA() {
        return enginecapacity;
    }

    public static void main(String[] args) {

        Car car1=new Car("Mazda",2020,3721 );
        Car car2=new Car("Opel",2014,2721 );
        Car car3=new Car("Mitsubisi",2009,1721 );
        Car car4=new Car("Nissan",2015,2841 );
        int Array[] = new int[4];// масиви
        Array[0]=car1.getA();
        Array[1]=car2.getA();
        Array[2]=car3.getA();
        Array[3]=car4.getA();
        Arrays.sort(Array);
       sort(Array);

    }
}
