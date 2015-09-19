package com.thoughtworks.baseline;

import java.util.List;

//Stores the current state and position of a cell
public class Cell {
    private State currentState;
    private int rowNumber;
    private int columnNumber;

    public Cell(State currentState, int rowNumber, int columnNumber) {
        this.currentState = currentState;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    public int checkForNeighboursAliveCount(List<Cell> listOfCells) {
        int[] neighboursRowIndex = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] neighboursColumnIndex = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        for (int i = 0; i < neighboursRowIndex.length; i++) {
            Cell cell = findCell(listOfCells, neighboursRowIndex[i], neighboursColumnIndex[i]);
        }
        return 0;
    }

    public Cell findCell(List<Cell> listOfCells, int rowNumber, int columnNumber) {
        Cell cellToSearch = new Cell(null, rowNumber, columnNumber);
        for (Cell cell : listOfCells)
            if (cell.equals(cellToSearch))
                return cell;
        return null;
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || that.getClass() != getClass())
            return false;
        return true;
    }
}
