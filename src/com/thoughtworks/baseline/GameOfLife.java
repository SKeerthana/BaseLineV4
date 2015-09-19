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
                int neighboursCount = checkForNeighboursCount(i, j);
            }
        }
        return state;
    }

    public int checkForNeighboursCount(int i, int j) {
        int count = 0;
        if (state[i - 1][j - 1] == "X")
            count++;
        return count;
    }
}
