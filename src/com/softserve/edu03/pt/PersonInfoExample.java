package com.softserve.edu03.pt;

public class PersonInfoExample {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student("Robert", 9);
        Student st3 = new Student("Pablo", 5.5);

        st1.setName("Enrike");
        st1.setRating(8.7);

        System.out.println("Quantity of students: " + Student.quantityOfStudents);
        System.out.println("Total rating: " + Student.totalRating);
        System.out.println("The average rating is: " + Student.avgRating());

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}

