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

    @Test
    public void shouldReturnFalseWhenStateValueIsDifferent() {
        AliveState aliveState1 = new AliveState("X");
        AliveState aliveState2 = new AliveState("-");

        assertNotEquals(aliveState1, aliveState2);
    }

    @Test
    public void shouldReturnTrueWhenStateValueIsSame() {
        AliveState aliveState1 = new AliveState("X");
        AliveState aliveState2 = new AliveState("X");

        assertEquals(aliveState1, aliveState2);
    }
}
