package src.com.softserve.edu02.homework.taskThree;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private final Scanner scanner = new Scanner(System.in);

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = 2002;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public int getAge(){
        return 2023-birthYear;
    }
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void input(){
        System.out.print("Input first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Input last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Input birth year: ");
        this.birthYear = scanner.nextInt();
    }
    public void output(){
        System.out.println("Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}');
    }
}
