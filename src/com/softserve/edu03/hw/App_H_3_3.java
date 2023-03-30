package com.softserve.edu03.hw;

public class App_H_3_3 {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person("ivan", "yashchuk", 2005);
        p1.input();
        p2.input();
        p3.input();
        p4.input();
        p5.input();

        System.out.println("///////////////");
        p1.output();
        p1.getAge();
        System.out.println("///////////////");
        p2.output();
        p2.getAge();
        System.out.println("///////////////");
        p3.output();
        p3.getAge();
        System.out.println("///////////////");
        p4.output();
        p4.getAge();
        System.out.println("///////////////");
        p5.output();
        p5.getAge();
        System.out.println("///////////////");
        p5.output();
        p5.changeName();
        p5.output();
    }
}
