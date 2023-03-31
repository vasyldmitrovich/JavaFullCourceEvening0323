package com.softserve.edu04.hw;

public class Dog_struct {
        private String Name;
        private int Age;
        private String Breed;

        Dog_struct(){

        }


    public Dog_struct(String name, int age, String breed){
            Name = name;
            Age = age;
            Breed = breed;
        }
        public String getName() {
            return Name;
        }
        public int getAge() {
            return Age;
        }
        public String  getBreed() {
            return Breed;
        }


    }

