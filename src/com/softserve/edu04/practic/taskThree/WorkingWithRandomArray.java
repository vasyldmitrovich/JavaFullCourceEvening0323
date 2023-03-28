package src.com.softserve.edu04.practic.taskThree;

import java.util.Arrays;
import java.util.Random;

public class WorkingWithRandomArray {
    private int[] arrayInt;
    public WorkingWithRandomArray() {
        Random random = new Random();
        arrayInt = new int[10];
        for(int i=0;i<arrayInt.length;i++){
            arrayInt[i] = random.nextInt(-100,100);
        }
        System.out.println("Random array = "+Arrays.toString(arrayInt));
    }
    public int getBigNumberInRandomArray(){
        return Arrays.stream(arrayInt).max().orElse(0);
    }
    public int getSumAllPositiveNumbersInArray(){
        return Arrays.stream(arrayInt).filter(number->number>=0).sum();
    }
    public long getCountAllNegativeNumbers(){
        return Arrays.stream(arrayInt).filter(number -> number < 0).count();
    }
    public void foundWhatMoreNegativeOrPositiveNumberInArray(){
        long countPositive = Arrays.stream(arrayInt).filter(number -> number > 0).count();
        long countNegative = Arrays.stream(arrayInt).filter(number -> number < 0).count();
        System.out.println(countPositive > countNegative ? "There are more positive values in the array" : countNegative == countPositive ? "There are an equal number of positive and negative values in the array" : "There are more negative values in the array");
    }
}
