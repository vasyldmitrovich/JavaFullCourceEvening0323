package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstTaskArrays {
    public static void main(String[] args) {

        String[] words = getStringArray();
        System.out.println("Words " + Arrays.toString(words));
        sortStringArray(words);
        System.out.println("Sorted array of words: " + Arrays.toString(words));

        int[] numbers = getNumberArray();
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("The average value is: " + calculateAverageValue(numbers));
        bubbleSort(numbers);
        System.out.println("Sorted array of numbers: " + Arrays.toString(numbers));

        //Good
        binarySearch(numbers, words);

    }

    static int getNumber(String message){
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    static String[] getStringArray(){
        int size = getNumber("Input the size of a String array: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input elements of the string array");
        String[] array = new String[size];
        int i = 0;
        while(i < size){
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = sc.next();
            i++;
        }
        return array;
    }

    static int[] getNumberArray(){
        Random rnd = new Random();
        int[] numbersArray = new int[5];
        for(int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = rnd.nextInt(16) + 1;
        }
        return numbersArray;
    }

    static double calculateAverageValue(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return Math.round(sum / array.length * 100) / 100d;
    }

    static void sortStringArray(String[] words){
        int size = words.length;
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                if(words[i].compareTo(words[j]) > 0 ){
                    swapElements(words, i, j);
                }
            }
        }
    }

    static void bubbleSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            for(int j = 0; j < numbers.length - i - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    swapElements(numbers, j, (j + 1));
                }
            }
        }
    }

    //Oo nice to see binary search there
    public static void binarySearch(int[]numbers, String[]words){
        System.out.print("\nInput the search value: ");
        Scanner sc = new Scanner(System.in);
        String searchTarget = sc.next();
        try {
            int indexInNumbers = Arrays.binarySearch(numbers, Integer.parseInt(searchTarget));
            if (indexInNumbers == -1) {
                System.out.println("There is no " + searchTarget + " in array " + Arrays.toString(numbers));
            } else {
                System.out.println(Arrays.toString(numbers));
                System.out.println(searchTarget + " has been found at position " + indexInNumbers);
            }
        } catch (Exception e) {
            System.out.println("value can not be transformed into integer");
        }

        int indexInWords = Arrays.binarySearch(words, searchTarget);
        if(indexInWords == -1){
            System.out.println("There is no " + searchTarget + " in array " + Arrays.toString(words));
        } else {
            System.out.println(Arrays.toString(words));
            System.out.println(searchTarget + " has been found at position " + indexInWords);
        }
    }

    static void swapElements(int[] numbers, int index1, int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    static void swapElements(String[] words, int index1, int index2){
        String temp = words[index1];
        words[index1] = words[index2];
        words[index2] = temp;
    }
}
