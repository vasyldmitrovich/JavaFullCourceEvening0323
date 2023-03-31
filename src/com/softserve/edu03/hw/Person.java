package com.softserve.edu03.hw;

import java.util.Scanner;

public class Person {
    private String FirstName;
    private String LastName;
    private int BirthYear;

    Person(){

    }

    public Person(String First,String Last,int Year){
        FirstName = First;
        LastName = Last;
        BirthYear = Year;
    }


    public void getAge(){
        System.out.println("The age of Person is "+(2023 - BirthYear));
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person`s Name: ");
        FirstName = sc.nextLine();
        System.out.println("Enter Person`s Last Name: ");
        LastName = sc.nextLine();
        System.out.println("Enter Person`s Birth year: ");
        BirthYear = sc.nextInt();

    }

    public void output(){
        String Name = FirstName;
        String lastname = LastName;
        int year = BirthYear;
        System.out.println("This Person`s name is "+Name);
        System.out.println("This Person`s last name is "+lastname);
        System.out.println("This Person`s birth year is "+year);

    }

    public void change(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new Name: ");
        FirstName = sc.nextLine();
        System.out.println("Enter new Last Name: ");
        LastName = sc.nextLine();
    }

}
