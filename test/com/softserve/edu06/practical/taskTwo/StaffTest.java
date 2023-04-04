package com.softserve.edu06.practical.taskTwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffTest {
    @Test
    public void salary() {
        Teacher teacher = new Teacher();
        Assert.assertTrue(teacher.salary() > 10000);
        Assert.assertEquals(teacher.print(),"I am a teacher");
    }
}