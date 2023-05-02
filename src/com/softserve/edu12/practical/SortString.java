package com.softserve.edu12.practical;

@FunctionalInterface
public interface SortString {

    //The word abstract do not need write there, java add this word by default
    abstract String[] sortedString(String ...strings);
}
