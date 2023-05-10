/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.edu14.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author rgonchar
 */
public class Pt14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        //Task_1
        System.out.println(ld.getDayOfWeek());
        
        //Task_2
        System.out.println(ld.now().with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY)));
        
        //Task_3
        List<String> list = new ArrayList();
        list.add("asdfasdf");
        list.add("fgsdfg");
        list.add("qwerwr");
        list.add("mdhjdfh");
        list.add("utyuiehs");
        list.add("ghgafg");
        
        
        mySort(list);
        list.forEach((s)->System.out.println(s));
        
        //Task_4
        Integer[] intArr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(count(intArr, n -> n%2 ==0));
             
    }
    
    public static void mySort (List list){
        list.sort(Comparator.naturalOrder());
    }
    
    public static int count (Integer[] arr, Predicate<Integer> predicate){
        int sum=0;
        for(Integer n: arr){
         if(predicate.test(n)){
             sum = sum+n;
         }
        }
        return sum;
    }
    
    
}
