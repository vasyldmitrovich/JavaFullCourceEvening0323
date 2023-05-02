package com.softserve.edu09.homework.taskOne;

import java.util.HashSet;
import java.util.Set;

//I am not created main class, I made test for it task.
public class SetOperation {//This is good

    public <T> Set<T> union(Set<T> setOne, Set<T> setTwo){
        Set<T> unionSet = new HashSet<>(setOne);
        unionSet.addAll(setTwo);
        return unionSet;
    }

    public <T> Set<T> interest(Set<T> setOne, Set<T> setTwo){
        Set<T> interestSet = new HashSet<>(setOne);
        interestSet.retainAll(setTwo);//Nice
        return interestSet;
    }
}
