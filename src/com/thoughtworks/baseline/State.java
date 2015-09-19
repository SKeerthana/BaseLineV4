package com.thoughtworks.baseline;

public interface State {
    State generateNewState(int neighbours);
}
