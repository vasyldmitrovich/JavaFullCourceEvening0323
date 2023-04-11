package com.softserve.edu08.practical.taskThree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random full myCollection");
        ArrayList<Integer> myCollection = fullRandom();
        myCollection.forEach((number)-> System.out.print(number+" "));
        LinkedList<Integer> newMyCollection = createNewCollection(myCollection);
        System.out.println("");
        System.out.println("Create newMyCollection");
        newMyCollection.forEach((number)-> System.out.print(number+" "));
        System.out.println("");
        System.out.println("Delete number from myCollection where more then 20");
        myCollection = deleteNumberMoreTwenty(myCollection);
        myCollection.forEach((number)-> System.out.print(number+" "));
        System.out.println("");
        System.out.println("Result after insert elements");
        myCollection = insertNewValues(myCollection);
        outputList(myCollection);
        System.out.println("Sorted collection");
        Collections.sort(myCollection);
        myCollection.forEach((number)-> System.out.print(number+" "));
    }

    private static void outputList(ArrayList<Integer> collection){
        for(int i =0; i < collection.size(); i++){
            System.out.println("Position = "+i+",value of element "+collection.get(i));
        }
    }

    private static ArrayList<Integer> insertNewValues(ArrayList<Integer> myCollection){
        if(myCollection.size() < 8){
            for(int i= myCollection.size(); i<=8;i++){
                myCollection.add(0);
            }
        }
        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);
        return myCollection;
    }

    private static ArrayList<Integer> deleteNumberMoreTwenty(ArrayList<Integer> myCollection){
        return myCollection.stream().filter((number)->number < 20).collect(Collectors.toCollection(ArrayList::new));
    }

    private static ArrayList<Integer> fullRandom(){
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i < 10; i++){
            arrayList.add(random.nextInt(0,50));
        }
        return arrayList;
    }

    private static LinkedList<Integer> createNewCollection(ArrayList<Integer> arrayList){
        LinkedList<Integer> newMyCollection = new LinkedList<>();
        for(Integer number : arrayList){
            if(number > 5){
                newMyCollection.add(number);
            }
        }
        return newMyCollection;
    }
}
