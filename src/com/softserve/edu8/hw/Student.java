package com.softserve.edu8.hw;

public class Student extends Person{
    private int level;
    public Student(FullName f1, int age) {
        super(f1, age);
    }

    @Override
    public String activity() {
        String a="drink";
        return a ;
    }
   /* @Override
    public String info(){
        return String.format("Ім'я: %s, Прізвище: %s, Вік: %d",
                
    }*/
}
