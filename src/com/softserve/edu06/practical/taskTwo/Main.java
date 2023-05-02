package com.softserve.edu06.practical.taskTwo;

public class Main {
    public static void main(String[] args) {//Ok
        Person[] people = new Person[5];
        people[0] = new Cleaner("bob");
        people[1] = new Student("Artur");
        people[2] = new Teacher("Galya");
        people[3] = new Student("Dima");
        people[4] = new Teacher("Luba");
        for (int i=0; i<people.length;i++){
            System.out.println(people[i].print());
            if(people[i] instanceof Staff){
                System.out.println("Salary for staff = "+((Staff) people[i]).salary());
            }
        }
    }
}
