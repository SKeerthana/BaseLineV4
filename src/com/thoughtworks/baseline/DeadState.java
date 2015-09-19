package com.thoughtworks.baseline;

//Calculates new state for dead cells
public class DeadState implements State {
    private String state = "-";

    public DeadState(String state) {
        this.state = state;
    }

    @Override
    public State generateNewState(int neighbours) {
        if (neighbours == 3)
            return new AliveState("X");
        return this;
    }

    @Override
    public boolean equals(Object that) {
        if (that == this)
            return true;
        if (that == null || that.getClass() != getClass())
            return false;
        DeadState thatState = (DeadState) that;
        return thatState.state.equals(state);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
