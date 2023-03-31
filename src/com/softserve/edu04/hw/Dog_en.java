package com.softserve.edu04.hw;

public class Dog_en {
    public enum Bre {
        Breed1("LABRADOR"),
        Breed2("BULLDOG"),
        Breed3("HUSKY");
        private final String br;

        Bre(String br) {
            this.br = br;
        }

        public String getBrd() {
            return br;
        }
    }
}

