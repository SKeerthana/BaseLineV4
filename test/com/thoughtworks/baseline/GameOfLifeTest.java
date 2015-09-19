package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    @Test
    public void shouldGenerateNextGeneration() {
        String[][] state = {{"X", "X"}, {"X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertArrayEquals(state, gameOfLife.generateNextGeneration());
    }

    @Test
    public void shouldReturnOneWhenOneIsNeighboursAlive() {
        String[][] state = {{"X", "-"}, {"-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(1, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnZeroWhenThereIsNoNeighbourAlive() {
        String[][] state = {{"-", "-"}, {"-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(0, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnTwoWhenThereAreTwoNeighboursAlive() {
        String[][] state = {{"X", "X"}, {"-", "-"}, {"X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(2, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnThreeWhenThereAreThreeNeighboursAlive() {
        String[][] state = {{"X", "X", "X"}, {"-", "-", "-"}, {"-", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(3, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnFourWhenThereAreFourNeighboursAlive() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "-"}, {"-", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(4, gameOfLife.checkForNeighboursCount(1, 1));
    }
}
