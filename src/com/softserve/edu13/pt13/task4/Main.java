package com.softserve.edu13.pt13.task4;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, -56, 6, 2, 56, 87, 34, -7, -45, 34};
        MyFunctional myFunctional = (int x) -> {
            if (x > 0) {
                return true;
            } else return false;
        };
        System.out.println("Result of condition (>0)");
        System.out.println(count(array, myFunctional));
    }

    private static int count(int[] arr, MyFunctional myFunctional) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (myFunctional.checkNumber(arr[i])) {
                count = count + arr[i];
            }
        }
        return count;
    }

}

