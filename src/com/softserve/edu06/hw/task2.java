package com.softserve.edu06.hw;


public class task2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Do not correct name of variable, could start from Upper case, must start from Lower case
         birds[] ArrayBirds = new birds[5];
        ArrayBirds[0] = new Penguin("No","Yes");
        ArrayBirds[1] = new Eagle("Yes"," Yes");
        ArrayBirds[2] = new Kiwi("No","Yes");
        ArrayBirds[3] =new Swallow("Yes","Yes");
        ArrayBirds[4] =new NoFlyingBird("Yes","Yes");


         for(int i=0; i<5; i++) {
             ArrayBirds[i].Mykd();
             ArrayBirds[i].print();
             ArrayBirds[i].fly();

         }
         }

    }
