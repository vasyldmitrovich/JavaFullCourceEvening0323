package com.softserve.edu03.hw;

public class PersonalInfo {
    public static void main(String[] args) {

        Person pr1 = new Person();
        Person pr2 = new Person();
        Person pr3 = new Person("Alan", "Jackson");
        Person pr4 = new Person("David", "Coperfield");
        Person pr5 = new Person("Arnold", "Shwarzenegger");

        pr1.input("Sarah", "Connor", "1986");

        pr2.setName("Evgen", "Klopotenko");
        pr2.setBirthYear(1983);

        pr3.setBirthYear(1975);

        pr4.changeName("John","Connor");
        pr4.setBirthYear(1990);

        pr5.setBirthYear(1947);

        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);
        System.out.println(pr4);
        System.out.println(pr5);

    }
}

