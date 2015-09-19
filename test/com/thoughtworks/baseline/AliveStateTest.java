package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AliveStateTest {

    @Test
    public void shouldGenerateAliveStateWhenNumberOfNeighbourIs2() {
        AliveState aliveState = new AliveState("X");
        assertEquals(aliveState, aliveState.generateNewState(2));
    }

    @Test
    public void shouldGenerateAliveStateWhenNumberOfNeighbourIs1() {
        AliveState aliveState = new AliveState("X");
        DeadState deadState = new DeadState("-");
        assertEquals(deadState, aliveState.generateNewState(1));
    }
}
