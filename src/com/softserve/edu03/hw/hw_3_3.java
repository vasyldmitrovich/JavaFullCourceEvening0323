import java.util.Scanner;

public class hw_3_3 {
    public static void main(String[] args) {
        Person Per_1 = new Person();
        Person Per_2 = new Person();
        Person Per_3 = new Person();
        Person Per_4 = new Person();
        Person Per_5 = new Person("Max","Petryk",2005);

        Per_1.input();
        Per_2.input();
        Per_3.input();
        Per_4.input();


        System.out.println("_____________");
        Per_1.output();
        System.out.println("_____________");
        Per_2.output();
        System.out.println("_____________");
        Per_3.output();
        System.out.println("_____________");
        Per_4.output();
        System.out.println("_____________");
        Per_5.output();

        Per_1.getAge();
        System.out.println("_____________");
        Per_5.change();
        Per_5.output();
    }
}
class Person{
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
        System.out.println("This Person`s neme is "+Name);
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