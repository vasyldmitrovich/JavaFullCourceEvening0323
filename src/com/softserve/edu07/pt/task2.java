package com.softserve.edu07.pt;



public class task2 {


    public static void make(Person person) {
       if (person instanceof Staff) { // перевіряємо, чи є об'єкт типу
           Staff t1 = (Staff) person;// downcasting до об'єкту типу
            t1.Salary(); // викликаємо метод makeSound() з класу
        }}


    public static void main(String[] args) {
        Person[] ArrayPerson = new Person[3];
        ArrayPerson[0] = new Student("Andrij");
        ArrayPerson[1] = new Cleaner("Taras",  5000);
        ArrayPerson[2] = new Teach("Oleh", 4000);

        for (int i = 0; i < 3; i++) {
            ArrayPerson[i].print();
            make(ArrayPerson[i]);

        }

    }
}

//Move to file Person.java
abstract class Person{
    private String name;
   public Person(String name){
       this.name=name;
   }

    public String getName() {
        return name;
    }

    //Word abstract and public do not need, this method have abstract and public by default
    abstract public void print();
}

//Move to file Student.java
class Student extends Person{
    //Type can be Enum not String, and not static
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("i am "+TYPE_PERSON+"\t"+getName());
    }
}


abstract class Staff extends Person{
    private String name;
    private  int salary;
    public static final String TYPE_PERSON = "Sttaf";
    public Staff(String name){
        super(name);
    }

    abstract public void Salary();
}


class Teach extends Staff{
    private String name;
    private int salary;
   /* public static final String TYPE_PERSON = "Teach";*/

    public Teach(String name, int salary) {
        super(name);
        this.salary=salary;
    }
    @Override
    public void print() {
        System.out.println("i am "+TYPE_PERSON+"\t"+getName());
    }
    public int getSalary() {
        return salary;
    }


    @Override
    public void Salary() {
        System.out.println("My salary is "+getSalary());

    }
}

class Cleaner extends Staff{
    private int salary;
 /*   public static final String TYPE_PERSON = "Cleaner";*/

    public Cleaner(String name,int salary) {
        super(name);
        this.salary=salary;
    }

    @Override
    public void print() {
        System.out.println("i am "+TYPE_PERSON+"\t"+getName());
    }
    public int getSalary() {
        return salary;
    }

    public void Salary() {
        System.out.println("My salary is"+getSalary());
    }
}
