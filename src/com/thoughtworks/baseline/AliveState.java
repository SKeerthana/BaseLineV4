package com.thoughtworks.baseline;

//Calculates new state for alive cells
public class AliveState implements State {
    private String state = "X";

    public AliveState(String state) {
        this.state = state;
    }

    @Override
    public State generateNewState(int neighbours) {
        if (neighbours < 2)
            return this;
        return new DeadState("-");
    }

    @Override
    public boolean equals(Object object) {
        return true;
    }

    @Override
    public boolean isAlive(){
        return true;
    }
}
