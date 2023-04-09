package com.softserve.edu08.hw;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Olga", "Reva"), 38, 1);
        Student student2 = new Student(new FullName("Lola", "Bebe"), 18, 2);
        System.out.println("Students created:");
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = (Student) student1.clone();
        student3.setCourse(5);
        System.out.println("Students after clone:");
        System.out.println(student1.info());
        System.out.println(student3.info());
    }
}
