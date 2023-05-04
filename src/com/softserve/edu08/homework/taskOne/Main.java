package com.softserve.edu08.homework.taskOne;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Full random collection\n");
        ArrayList<Integer> myCollection = fullRandom();
        myCollection.forEach((number)-> System.out.print(number+" "));
        System.out.println("Swap min amd max value");
        myCollection = swapMaxAndMinElement(myCollection);
        myCollection.forEach((number)-> System.out.print(number+" "));
        System.out.println("");
        myCollection = setThreeDigitNumberBeforeFirstNegativeNumber(myCollection);
        System.out.println("Set number before first negative number\n");
        myCollection.forEach((number)-> System.out.print(number+" "));
        System.out.println("Insert zero number between numbers where have different sign\n");
        myCollection = insertZeroBetweenNumbersWhereHaveDifferentSign(myCollection);
        myCollection.forEach((number)-> System.out.print(number+" "));
        System.out.println("Copy parts myCollection in other collection");
        System.out.println("Input please index k for div list");
        int numberForDiv = scanner.nextInt();
        List<Integer> list1 = myCollection.subList(0,numberForDiv);
        List<Integer> list2 = myCollection.subList(numberForDiv, myCollection.size());
        Collections.reverse(list2);
        System.out.println("List 1");
        list1.forEach((number)-> System.out.print(number+" "));
        System.out.println("");
        System.out.println("List 2");
        list2.forEach((number)-> System.out.print(number+" "));
        System.out.println("");
        System.out.println("Delete last even number in myCollection\n");
        myCollection.forEach((number)-> System.out.print(number+" "));
        myCollection = deleteEvenLastNumber(myCollection);
        myCollection.forEach((number)-> System.out.print(number+" "));
        System.out.println("Delete number after first min element in myCollection");
        myCollection.forEach((number)-> System.out.print(number+" "));
        myCollection = removeAllElementsAfterFirstMinElement(myCollection);
        myCollection.forEach((number)-> System.out.print(number+" "));
    }

    private static ArrayList<Integer> removeAllElementsAfterFirstMinElement(ArrayList<Integer> myCollection){
        int indexMinElem = myCollection.indexOf(Collections.min(myCollection));
        System.out.println(myCollection.size());
        if(indexMinElem == myCollection.size()){
            return myCollection;
        }
        return myCollection.subList(0,indexMinElem+1).stream().collect(Collectors.toCollection(ArrayList::new));
    }

    private static ArrayList<Integer> deleteEvenLastNumber(ArrayList<Integer> myCollection){
        int indexLastEvenNumber = -1;
        for( int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) % 2 == 0 && myCollection.get(i) != 0){
                indexLastEvenNumber = i;
            }
        }
        if(indexLastEvenNumber != -1){
            myCollection.remove(indexLastEvenNumber);
        }else {
            System.out.println("Even number in collection not found!");
        }
        return myCollection;
    }

    private static ArrayList<Integer> insertZeroBetweenNumbersWhereHaveDifferentSign(ArrayList<Integer> myCollection){
        for(int i = 1; i < myCollection.size(); i++){
            if(isNegative(myCollection.get(i-1)) == !isNegative(myCollection.get(i))){
                myCollection.add(i,0);
                i++;
            }
        }
        return myCollection;
    }

    private static boolean isNegative(int i){
        return i < 0 ? true : false;
    }

    private static ArrayList<Integer> setThreeDigitNumberBeforeFirstNegativeNumber(ArrayList<Integer> myCollection){
        Random random = new Random();
        int number = random.nextInt(100,999);
        for(int i=0; i < myCollection.size(); i++){
            if(myCollection.get(i) < 0){
                myCollection.add(i,number);
                break;
            }
        }
        return myCollection;
    }

    private static ArrayList<Integer> swapMaxAndMinElement(ArrayList<Integer> myCollection){
        int indexMax = myCollection.indexOf(Collections.max(myCollection));
        int indexMin = myCollection.indexOf(Collections.min(myCollection));
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        myCollection.set(indexMax,min);
        myCollection.set(indexMin,max);
        return myCollection;
    }

    private static ArrayList<Integer> fullRandom(){
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i < 10; i++){
            arrayList.add(random.nextInt(-20,20));
        }
        return arrayList;
    }
}
