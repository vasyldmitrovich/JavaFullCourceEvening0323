package edu03.homework3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tim", "Burton");
        Person person2 = new Person("Anna", "Karenina");
        Person person3 = new Person("Taras", "Shevchenko");
        Person person4 = new Person("Ivan", "Mazepa");
        Person person5 = new Person("Edgar Alan", "Po");
        person1.setBirthYear(1958);
        System.out.println(Methods.getAge(person1));
        person3.setBirthYear(1814);
        Methods.output(person3);
        Methods.changeName(person2, "Tetiana");
    }
}
