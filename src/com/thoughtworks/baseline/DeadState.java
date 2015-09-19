package com.thoughtworks.baseline;

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
}
