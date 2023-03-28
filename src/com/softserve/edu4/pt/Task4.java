package com.softserve.edu4.pt;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner br=new Scanner(System.in);
       int  a= br.nextInt();
        Facutly obj=new Facutly(a);
        SESON season = SESON.WINTER;
        System.out.println(season.names());
        System.out.println(obj.getA());

    }



}
class Facutly{
    private int count;

    public Facutly(int count){
        this.count=count;
    }
    public int getA() {
        return count;
    }

    // Setter
    public void setA(int newA) {
        this.count = newA;

    }
}
enum SESON {
    SPRING,
    SUMMER ,
    AUTUMN ,
    WINTER ;
    public SESON names() {
        if (this == SESON.WINTER) {System.out.println("WINTER");return WINTER;}
        if (this == SESON.SPRING) {System.out.println("WINTER");return SPRING;}
        if (this == SESON.SUMMER) {System.out.println("WINTER");return SUMMER;}

        return SESON.AUTUMN;
    }


}