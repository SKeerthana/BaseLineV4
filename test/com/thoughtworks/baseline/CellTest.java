package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CellTest {
    @Test
    public void shouldReturnNumberOfNeighboursInAliveState() {
        final Cell cell1 = new Cell(new AliveState("X"), 0, 0);
        final Cell cell2 = new Cell(new DeadState("-"), 0, 1);
        final Cell cell3 = new Cell(new AliveState("X"), 1, 0);
        final Cell cell4 = new Cell(new DeadState("-"), 1, 1);
        List<Cell> listOfCells = new ArrayList<Cell>() {{
            add(cell1);
            add(cell2);
            add(cell3);
            add(cell4);
        }};
        assertEquals(0, cell1.checkForNeighboursAliveCount(listOfCells));
    }

    @Test
    public void shouldFindTheNeighbouringCell() {
        final Cell cell1 = new Cell(new AliveState("X"), 0, 0);
        final Cell cell2 = new Cell(new DeadState("-"), 0, 1);
        final Cell cell3 = new Cell(new AliveState("X"), 1, 0);
        final Cell cell4 = new Cell(new DeadState("-"), 1, 1);
        List<Cell> listOfCells = new ArrayList<Cell>() {{
            add(cell1);
            add(cell2);
            add(cell3);
            add(cell4);
        }};
        assertEquals(cell4, cell1.findCell(listOfCells, 1, 1));
    }

    @Test
    public void shouldReturnFalseWhenCellIsComparedWithNull() {
        Cell cell = new Cell(new AliveState("X"), 0, 0);
        assertNotEquals(cell, null);
    }

    @Test
    public void shouldReturnFalseWhenCellIsComparedWithOtherObjects() {
        Cell cell = new Cell(new AliveState("X"), 0, 0);
        assertNotEquals(cell, "StringToTest");
    }

    @Test
    public void shouldReturnTrueWhenRowNumberIsSame() {
        Cell cell1 = new Cell(new AliveState("X"), 0, 0);
        Cell cell2 = new Cell(new DeadState("-"), 0, 1);
        assertEquals(cell1, cell2);
    }
}
