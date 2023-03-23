package com.softserve.edu01.pt;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        People people1 = new People();
        String Name = people1.input();
        String LastName = people1.input();
        Scanner br = new Scanner(System.in);
        int age= br.nextInt();



        People people = new People(Name, LastName, age);//створення обєкта класу

        //set

    // String s= people.GetName();//get
    //System.out.println(s);*/
        people.output(Name,LastName);

        System.out.println(people.GetAge());
       people.SetName( people.chan());
       String n1=people.GetName();
        System.out.println(people);
        /*people.output(n1,LastName);
        System.out.println(people.GetAge());*/

    //end




    }


    }

 class People{
    private String name;
    private String LastName;
    private int age;
     public People(String Name,String LastName, int age)
     { this.name=Name;
         this.LastName=LastName;
         this.age=age;

     }
     public People(){

     }
     @Override
     public String toString() {

         return "Person{"
                 + "fullName='" + name
                 + ", age=" + age
                 + ", retired=" + LastName
                 + '}';
     }

    public String input(){
        Scanner br=new Scanner(System.in);
        String Itform =br.nextLine();
         return Itform;
    }
     public String chan(){
         System.out.println("New Name");
         Scanner br=new Scanner(System.in);
         String newname =br.nextLine();
         return newname;
     }

     public String output(String Itform , String name ){
         System.out.println(Itform+"\n"+name);
      return Itform;
     }
     public String GetName(){
         return name;

     }

     public void  SetName(String Name){
         this.name=Name;

     }
     public String GetLName(){
         return LastName;

     }

     public void  SetLName(String LastName){
         this.LastName=LastName;

     }


     public int GetAge(){
         return age;

     }

     public void  SetAge(int age){
         this.age=age;

     }

}