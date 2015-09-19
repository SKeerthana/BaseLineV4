package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GameOfLifeTest {
    @Test
    public void shouldGenerateNextGeneration() {
        String[][] state = {{"X","X"}, {"X","X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertArrayEquals(state, gameOfLife.generateNextGeneration());
    }
}
