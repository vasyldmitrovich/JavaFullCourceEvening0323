package com.softserve.edu06.pt;

//Name must start for Upper case
abstract class car {
    private int maxSpeed;
    private  int yearOfProduction;
    //Firstly must go constructors and after that getters and setters, and after that methods
    @Override
    public String toString() {
        return   maxSpeed+" "+yearOfProduction;
    }
    public  car( int maxSpeed,int yearOfProduction){
        this.maxSpeed=maxSpeed;
        this.yearOfProduction=yearOfProduction;

    }


    //Please generate getters and setters automatic, because naming there is not correct
    public int GetmaxSpeed(){

        return maxSpeed ;

    }
    public void  SetmaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;

    }
    public int yearOfProduction(){
        return yearOfProduction ;
    }

    public void  yearOfProduction(int yearOfProduction){
        this.yearOfProduction=yearOfProduction;

    }
    //Why do not have space before method???
public void  run(){
System.out.println("car is runing");
}
//Without word abstract, this word java add by default
   abstract void stop();
}

//Move class to file Track.java and do the same with another classes
 class Truck extends car{
     private String names;

     public Truck(int maxSpeed, int yearOfProduction, String names){
        super(maxSpeed, yearOfProduction);
        setname(names);
    }
    public void  setname(String names){
         this.names=names;

     }

    public void stop(){
        System.out.println("Truck is stoped");
    }
    @Override
    public void  run(){
        System.out.println("Truck is running");
    }

 }

class Sedan extends car{
    private String names;

    public Sedan(int maxSpeed, int yearOfProduction, String names){
        super(maxSpeed, yearOfProduction);
        setname(names);
        }
public void  setname(String names){
        this.names=names;

        }


public void stop(){
        System.out.println("Sedan is stoped");
        }
@Override
public void  run(){
        System.out.println("Sedan is running");
        }

        }


//Please rename class to Test
 class test{
     public static void main(String[] args) {


         car[] abc = new car [4];

         abc[0] = new Truck(323,2019, "truk2");
         abc[1] = new Truck(323,2019, "truk3");
         abc[2] = new Truck(230,2022,"truck1");
         abc[3] = new Sedan(230,2022,"SEDAN");
        for (int i = 0; i<4; i++) {


            System.out.println("Max_Speed: " + abc[i].GetmaxSpeed());
            System.out.println("Year of Production: " + abc[i].yearOfProduction());
            abc[i].run();
            abc[i].stop();
            System.out.println("\t");
        }

         //abc.toString();

     }
 }