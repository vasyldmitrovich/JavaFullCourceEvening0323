package com.softserve.edu03.hw;

import java.util.Scanner;

public class Hw_3_3 {
    public static void main(String[] args) {
        Person Per_1 = new Person();
        Person Per_2 = new Person();
        Person Per_3 = new Person();
        Person Per_4 = new Person();
        Person Per_5 = new Person("Max","Petryk",2005);

        Per_1.input();
        Per_2.input();
        Per_3.input();
        Per_4.input();


        System.out.println("_____________");
        Per_1.output();
        System.out.println("_____________");
        Per_2.output();
        System.out.println("_____________");
        Per_3.output();
        System.out.println("_____________");
        Per_4.output();
        System.out.println("_____________");
        Per_5.output();

        Per_5.getAge();
        System.out.println("_____________");
        Per_5.change();
        Per_5.output();
    }
}
