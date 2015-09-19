package com.thoughtworks.baseline;

//Calculates new state for dead cells
public class DeadState implements State{
    private String state = "-";

    public DeadState(String state) {
        this.state = state;
    }

    @Override
    public State generateNewState(int neighbours) {
        return this;
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || that.getClass() != getClass())
            return false;
        return true;
    }

    @Override
    public boolean isAlive(){
        return false;
    }
}
