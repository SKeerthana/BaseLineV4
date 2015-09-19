package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    @Test
    public void shouldGenerateNextGeneration() {
        String[][] state = {{"X","X"}, {"X","X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertArrayEquals(state, gameOfLife.generateNextGeneration());
    }

    @Test
    public void shouldReturnNumberOfNeighboursAlive() {
        String[][] state = {{"X","X"}, {"X","X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(0, gameOfLife.checkForNeighboursCount());
    }

}
