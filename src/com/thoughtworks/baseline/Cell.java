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
        return 0;
    }

}
