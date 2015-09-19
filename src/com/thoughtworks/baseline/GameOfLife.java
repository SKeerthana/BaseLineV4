package com.thoughtworks.baseline;

public class GameOfLife {
    private String[][] state;

    public GameOfLife(String[][] state) {
        this.state = state;
    }

    public String[][] generateNextGeneration() {
        return state;
    }
}
