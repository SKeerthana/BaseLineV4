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
            return new DeadState("-");
        ;
        return this;
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || that.getClass() != getClass())
            return false;
        AliveState thatAliveState = (AliveState) that;
        return thatAliveState.state.equals(state);
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
