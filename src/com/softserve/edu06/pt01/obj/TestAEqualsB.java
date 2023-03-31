package com.softserve.edu06.pt01.obj;

public class TestAEqualsB {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a = b;
        System.out.println(b.field1);
        System.out.println(b.field2);
    }
}
