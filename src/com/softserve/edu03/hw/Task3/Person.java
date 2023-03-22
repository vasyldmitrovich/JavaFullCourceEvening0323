package com.softserve.edu03.hw.Task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Person {
    private String firstName;
    private String lastName;
    private int yearBirth;
    public Person(){
        firstName = "Default firstname";
        lastName = "Default lastname";
        yearBirth = 0;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = 0;
    }
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setYearBirth(int yearBirth){this.yearBirth = yearBirth;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getYearBirth(){return yearBirth;}
    public int getAge(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy ");
        String  date = dateFormat.format(Calendar.getInstance().getTime());
        return Integer.parseInt(date.trim()) - yearBirth;
    }
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        yearBirth = scanner.nextInt();
        System.out.print("--------------------------------\n");

    }
    public void output(){
        System.out.println("Person{" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", birthYear= '" + yearBirth + '\'' +
                ", Years old= '" + getAge() + '\'' +
                '}');
    }

}
