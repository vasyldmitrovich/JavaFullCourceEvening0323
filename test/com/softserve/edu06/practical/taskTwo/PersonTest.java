package com.softserve.edu06.practical.taskTwo;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void print() {
        Student student = new Student();
        Assert.assertEquals(student.print(),"I am a student");
        try {
            Field typePerson = student.getClass().getDeclaredField("TYPE_PERSON");
            Assert.assertEquals(typePerson.getType(), TypePerson.class);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        }
    }
}