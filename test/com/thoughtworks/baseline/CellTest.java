package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void shouldReturnNumberOfNeighboursInAliveState() {
        final Cell cell1 = new Cell(new AliveState("X"), 0, 0);
        final Cell cell2 = new Cell(new DeadState("-"), 0, 0);
        final Cell cell3 = new Cell(new AliveState("X"), 0, 0);
        final Cell cell4 = new Cell(new DeadState("-"), 0, 0);
        List<Cell> listOfCells = new ArrayList<Cell>(){{add(cell1);add(cell2);add(cell3);add(cell4);}};
        assertEquals(0, cell1.checkForNeighboursAliveCount(listOfCells));
    }
}
