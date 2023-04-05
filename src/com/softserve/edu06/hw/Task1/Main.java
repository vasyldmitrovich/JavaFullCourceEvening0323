package com.softserve.edu06.hw.Task1;

public class Main {
    public static void main(String[] args) {

        Bird eagle = new Eagle("red color", true, true, "common eagle");
        Bird kiwi = new Kiwi("brown color", true, false, "common kiwi");
        Bird penguin = new Penguin("white color", true, true,"common penguin");
        Bird swallow = new Swallow("black color", false, true, "common swallow");

        Bird[] array = {eagle,kiwi,penguin,swallow};

        for(Bird temp : array){
            temp.fly();
            System.out.println(temp);
        }
    }
}
