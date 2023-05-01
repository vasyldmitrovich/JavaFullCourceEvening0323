package com.softserve.edu07.pt;

public class AppP_7_2 {
    public static void main(String[] args) {
        Person[] arr = new Person[5];
        arr[0] = new Teacher("Ivan");
        arr[1] = new Cleaner("Max");
        arr[2] = new Student("Bob");
        arr[3] = new Teacher("Sam");
        arr[4] = new Cleaner("Tom");

        //Use foreach loop instead classical for
        for(int i = 0; i< arr.length; i++){
            arr[i].print();
            if(arr[i] instanceof Staff){
               System.out.println("My salary is "+ ((Staff) arr[i]).salary());
            }
        }

    }
}
