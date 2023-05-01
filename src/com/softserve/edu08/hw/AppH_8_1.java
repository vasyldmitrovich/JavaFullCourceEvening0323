package com.softserve.edu08.hw;

public class AppH_8_1 {
    public static void main(String[] args) {
        Student s1 = new Student(new FullName("Ivan", "Yashchuk"), 18, 1);
        Student s2 = new Student(new FullName("Max", "Petryk"), 17, 1);


        //Rewrite code, use loop, and in cycle call this two methods
        System.out.println(s1.activity());
        System.out.println(s1.info());

        System.out.println("///////////////////");

        System.out.println(s2.activity());
        System.out.println(s2.info());

        System.out.println("///////////////////");
        Student s3 = null;
        try {
            s3 = s1.clone();
            s3.setCourse(2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Error!!");
        }
        System.out.println(s3.activity());
        System.out.println(s3.info());
    }
}
