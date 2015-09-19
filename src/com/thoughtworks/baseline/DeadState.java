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
    public boolean equals(Object object) {
        return true;
    }

    @Override
    public boolean isAlive(){
        return false;
    }
}
