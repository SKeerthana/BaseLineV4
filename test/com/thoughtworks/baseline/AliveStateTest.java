package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void shouldReturnFalseWhenComparedWithNull() {
        AliveState aliveState = new AliveState("X");
        assertNotEquals(aliveState, null);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithAnotherObjectOfDifferentType() {
        AliveState aliveState = new AliveState("X");
        assertNotEquals(aliveState, "SomeString");
    }
}
