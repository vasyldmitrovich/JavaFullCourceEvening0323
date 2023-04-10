package com.softserve.edu06.pt;

public class Teacher extends Staff{
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    public void print() {
        System.out.println("I am a " + TYPE_PERSON+" "+name);
    }

    public int salary() {
      return 2400;
    }
}
