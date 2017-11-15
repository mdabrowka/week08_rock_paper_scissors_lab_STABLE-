package com.example.marta.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by marta on 15/11/2017.
 */

public class GameTest {
    Choices choices;
    Game game;


    @Before
    public void before() {
        game = new Game();

    }

//    @Test
//    public void canGetChoices() {
//        assertEquals()
//    }

    // Test 1
    @Test
    public void testCanReturnRandomChoice() {
        assertNotNull(game.getRandomChoice());
    }

    //Test 2 (kind of tested randomness)
//    @Test
//    public void testRockOrPaperOrScissorsReturn() {
//        assertEquals(choices.PAPER, game.getRandomChoice());
//    }


    @Test
    public void testDrawGame() {
        String actual = game.play(choices.ROCK, choices.ROCK);
        assertEquals("Draw", actual);
    }

    @Test
    public void testHumanWinsGame() {
        String actual = game.play(choices.ROCK, choices.SCISSORS);
        assertEquals("Human wins game", actual);
    }

    @Test
    public void testComputerWinsGame() {
        String actual = game.play(choices.PAPER, choices.SCISSORS);
        assertEquals("Computer wins game", actual);
    }

}