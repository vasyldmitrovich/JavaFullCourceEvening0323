import java.util.Scanner;

public class hw_3{
    public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    Person p4 = new Person();
    Person p5 = new Person("ivan", "yashchuk", 2005);

//    p1.input();
//    p2.input();
//    p3.input();
//    p4.input();
//    p5.input();
//
//        System.out.println("///////////////");
//    p1.output();
//        System.out.println("///////////////");
//    p2.output();
//        System.out.println("///////////////");
//    p3.output();
//        System.out.println("///////////////");
//    p4.output();
//        System.out.println("///////////////");
//    p5.output();
//        System.out.println("///////////////");
       p5.output();
    p5.changeName();
    p5.output();

    }
}
class Person{
    private String FirstName;
    private String LastName;
    private int BirthYear;

    Person(){

    }
    public  Person(String first, String last, int year ) {
        FirstName = first;
        LastName  = last;
        BirthYear = year;
    }
    public  void getAge(){
        System.out.println("The age of your person  is " + ( 2023 - BirthYear ));
    }
    public  void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name -->  ");
        FirstName = sc.nextLine();
        System.out.println("Enter lastname -->  ");
        LastName = sc.nextLine();
        System.out.println("Enter birth year -->  ");
        BirthYear = sc.nextInt();
    }
    public void output(){
        String name = FirstName;
        String lastname = LastName;
        int year = BirthYear;
        System.out.println("The name of this person is -->  " + name);
        System.out.println("The lastname of this person is -->  " + lastname);
        System.out.println("The BirthYear of this person is -->  " + year);
    }
    public void changeName(){
        Scanner sc = new Scanner(System.in);
        FirstName  = sc.nextLine();
        LastName = sc.nextLine();



    }
}
