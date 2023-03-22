package com.softserve.edu03.pt.Task2;



public class Main {
    public static void main(String [] args){
        Employee em1 = new Employee("Bob");
        Employee em2 = new Employee("Jonny", 10);
        Employee em3 = new Employee("Steve", 15, 8);
        em1.setRate(15);
        em1.setHours(12);
        em2.setHours(4);
        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        System.out.println("Total salary of all employees: " + ((em1.getSalary()+em1.getBonuses())+
                (em2.getSalary() + em2.getBonuses()) + (em3.getSalary() + em3.getBonuses())));
    }
}
