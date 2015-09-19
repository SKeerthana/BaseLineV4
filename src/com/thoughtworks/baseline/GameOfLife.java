package com.thoughtworks.baseline;

//Generates next state based on the current state of cells
public class GameOfLife {
    private String[][] state;

    public GameOfLife(String[][] state) {
        this.state = state;
    }

    public String[][] generateNextGeneration() {
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[0].length; j++) {
                int neighboursCount = checkForNeighboursCount();
            }
        }
        return state;
    }

    public int checkForNeighboursCount() {
        return 0;
    }
}
