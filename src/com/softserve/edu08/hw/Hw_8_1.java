package com.softserve.edu08.hw;



public class Hw_8_1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName fullName1 = new FullName("Max", "Petryk");
        Person per = new Person(fullName1, 25) {
            @Override
            public String activity() {
                return "Working";
            }
        };
        FullName fullName2 = new FullName("Ivan", "Yashchuk");
        Student stud = new Student(fullName2,20,3);
        FullName fullName3 = new FullName("Yaroslav","Fedorkiv");
        Student stud2 = new Student(fullName3,21,4);



        Student stud3 = null;
        try {
            stud3 = stud.clone();
            stud3.setCourse(2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Error");
        }

        System.out.println(per.info()+" activity:"+per.activity());
        System.out.println(stud.info()+" activity: "+stud.activity());
        System.out.println(stud2.info()+" activity: "+stud2.activity());
        System.out.println(stud3.info()+" activity: "+stud3.activity());

    }
}
