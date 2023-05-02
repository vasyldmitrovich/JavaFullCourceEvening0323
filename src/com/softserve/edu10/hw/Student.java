package com.softserve.edu10.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    /*In entity class could be method like this:
    *
    * public double discountPrice(User user) {
        if (user.getSpend() < 3000) return price;
        if (user.getSpend() < 1000) return price*0.9;
        return price*0.8;
    }//Discount for user if he spend a certain amount money
    *
    *
    * This method move to class where is main method*/
    public void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    //Nice to see code like that there, good
    public static Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    };

    public static Comparator<Student> courseComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getCourse() - student2.getCourse();
        }
    };
}
