package com.softserve.edu04.homework.taskFour;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessRandomNumberGameTest {
    private static GuessRandomNumberGame guessRandomNumberGame;
    @BeforeClass
    public static void setDateForStartTest(){
        guessRandomNumberGame = new GuessRandomNumberGame();
        guessRandomNumberGame.setGuessNumber(4);
    }
    @Test
    public void checkNumberForGame() {
        Assert.assertNotEquals(guessRandomNumberGame.checkNumberForGame(5),"Too low, try again");
        Assert.assertEquals(guessRandomNumberGame.checkNumberForGame(6),"Too high, try again");
    }
}