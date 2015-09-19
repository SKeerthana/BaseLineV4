package com.thoughtworks.baseline;

//Calculates new state for alive cells
public class AliveState implements State{
    private String state = "X";

    public AliveState(String state) {
        this.state = state;
    }

    public State generateNewState(int neighbours) {
        return this;
    }

    @Override
    public boolean equals(Object object){
        return true;
    }
}
