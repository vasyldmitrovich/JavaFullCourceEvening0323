package com.softserve.edu04.pt.Task1;

public class FindOdd {
    private int[] numbers;

    public FindOdd(int... numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void odd() {
        int counter = 0;
        System.out.print("Odd numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                counter++;
                System.out.print(number + "; ");
            }
        }
        // Specify message please, what it is, print more detail info what it is
        System.out.println("\nIt's " + counter + " out of " + numbers.length);
    }
}
