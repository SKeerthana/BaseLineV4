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
                String newState = generateNewState(neighboursCount, state[i][j]);
            }
        }
        return state;
    }

    public String generateNewState(int neighboursCount, String state) {
        if ((neighboursCount < 2 || neighboursCount > 3) && state.equals("X"))
            return "-";
        return "X";
    }

    public int checkForNeighboursCount(int i, int j) {
        int count = 0;
        if (i - 1 >= 0 && j - 1 >= 0 && state[i - 1][j - 1] == "X")
            count++;
        if (i - 1 >= 0 && j - 1 >= 0 && state[i - 1][j] == "X")
            count++;
        if (j + 1 < state[0].length && i - 1 >= 0 && state[i - 1][j + 1] == "X")
            count++;
        if (j - 1 >= 0 && state[i][j - 1] == "X")
            count++;
        if (j + 1 < state[0].length && state[i][j + 1] == "X")
            count++;
        if (i + 1 < state.length && j - 1 >= 0 && state[i + 1][j - 1] == "X")
            count++;
        if (i + 1 < state.length && state[i + 1][j] == "X")
            count++;
        if (i + 1 < state.length && j + 1 < state[0].length && state[i + 1][j + 1] == "X")
            count++;
        return count;
    }
}
