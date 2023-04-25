package com.softserve.edu07.pt;
import java.lang.Enum;
public class SecondTaskWorkers {

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Teacher("Frank");
        persons[1] = new Cleaner("Petro");
        persons[2] = new Student("Borys");

        for(Person person: persons){
            System.out.println(person.print());
            if(person instanceof Staff){
                ((Staff) person).salary();
            }
        }

    }
}
