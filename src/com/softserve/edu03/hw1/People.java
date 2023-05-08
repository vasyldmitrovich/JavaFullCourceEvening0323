package com.softserve.edu03.hw1;

import java.util.Scanner;

public class People{
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
    public String chan(String newname){
        System.out.println("New Name");
        Scanner br=new Scanner(System.in);
        newname =br.nextLine();
        return newname;
    }

    public String output(String Itform , String name ){
        System.out.println(Itform+"\n"+name);
        return Itform;
    }
   public String GetName(){
        return name;

    }

 public void  SetName(String Name) {
     this.name = Name;
 }

 // public String GetLName(){
     // return LastName;

   //}

   // public void  SetLName(String LastName){
      //  this.LastName=LastName;

  //  }


    public int GetAge(){
        return age;

    }

    public void  SetAge(int age){
        this.age=age;

    }

      public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
          System.out.println("Input all information");
          String  name1=br.nextLine();
            String  Sname1=br.nextLine(); 
          int age1 = br.nextInt();

    People people1=new People(name1,Sname1,age1)  ;
           System.out.println(  people1.GetAge());
             System.out.println(  people1.toString());
                people1.SetName("Danon");
             System.out.println(  people1.GetName());
              System.out.println(  people1.toString());


    }
}