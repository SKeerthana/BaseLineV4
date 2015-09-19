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
    public void shouldGenerateNextGenerationForBoatPattern() {
        String[][] state = {{"X", "X", "-"}, {"X", "-", "X"}, {"-", "X", "-"}};
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
        assertEquals(4, gameOfLife.checkForNeighboursCount(1, 1));
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

    @Test
    public void shouldNotCheckIfRowIndexValueIsNegative() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "-"}, {"-", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(3, gameOfLife.checkForNeighboursCount(0, 1));
    }

    @Test
    public void shouldNotCheckIfColumnIndexValueIsNegative() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "-"}, {"-", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(2, gameOfLife.checkForNeighboursCount(0, 0));
    }

    @Test
    public void shouldNotCheckIfColumnIndexValueIsGreaterThanOriginalColumnLength() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "-"}, {"-", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(0, gameOfLife.checkForNeighboursCount(2, 2));
    }

    @Test
    public void shouldReturnFiveWhenThereAreFiveNeighboursAlive() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"-", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(5, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnSixWhenThereAreSixNeighboursAlive() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(6, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldNotCheckIfRowIndexValueIsGreaterThanTheNumberOfRowsAvailable() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "-"}, {"-", "-", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(0, gameOfLife.checkForNeighboursCount(2, 2));
    }

    @Test
    public void shouldReturnSevenWhenThereAreSevenNeighboursAlive() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "-"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(7, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnEightWhenThereAreEightNeighboursAlive() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals(8, gameOfLife.checkForNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnHyphenWhenCurrentStateIsXAndNeighboursCountIsOne() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("-", gameOfLife.generateNewState(1, "X"));
    }

    @Test
    public void shouldReturnHyphenWhenCurrentStateIsXAndNeighboursCountIsZero() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("-", gameOfLife.generateNewState(0, "X"));
    }

    @Test
    public void shouldReturnXWhenCurrentStateIsXAndNeighboursCountIsGreaterThan1() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("X", gameOfLife.generateNewState(2, "X"));
    }

    @Test
    public void shouldReturnHyphenWhenCurrentStateIsXAndNeighboursCountIsGreaterThan3() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("-", gameOfLife.generateNewState(4, "X"));
    }

    @Test
    public void shouldReturnXWhenCurrentStateIsXAndNeighboursCountIsEqualTo2() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("X", gameOfLife.generateNewState(2, "X"));
    }

    @Test
    public void shouldReturnXWhenCurrentStateIsXAndNeighboursCountIsEqualTo3() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("X", gameOfLife.generateNewState(3, "X"));
    }

    @Test
    public void shouldReturnHyphenWhenCurrentStateIsHyphenAndNeighboursCountIsEqualTo2() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("-", gameOfLife.generateNewState(2, "-"));
    }

    @Test
    public void shouldReturnXWhenCurrentStateIsHyphenAndNeighboursCountIsEqualTo3() {
        String[][] state = {{"X", "X", "X"}, {"X", "-", "X"}, {"X", "X", "X"}};
        GameOfLife gameOfLife = new GameOfLife(state);
        assertEquals("X", gameOfLife.generateNewState(3, "-"));
    }
}
