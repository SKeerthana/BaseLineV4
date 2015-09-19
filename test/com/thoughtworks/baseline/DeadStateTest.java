package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeadStateTest {
    @Test
    public void shouldGenerateDeadState() {
        DeadState deadState = new DeadState("-");

        assertEquals(deadState, deadState.generateNewState(2));
    }

    @Test
    public void shouldGenerateAliveStateWhenNeighboursCountIs3() {
        DeadState deadState = new DeadState("-");

        assertEquals(new AliveState("X"), deadState.generateNewState(3));
    }

    @Test
    public void shouldReturnFalseWhenComparedWithNull() {
        DeadState deadState = new DeadState("-");

        assertNotEquals(deadState, null);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithAnotherObjectOfDifferentType() {
        DeadState deadState = new DeadState("-");

        assertNotEquals(deadState, "SomeString");
    }

    @Test
    public void shouldReturnFalseWhenStateValueIsDifferent() {
        DeadState deadState = new DeadState("X");
        DeadState deadState1 = new DeadState("-");

        assertNotEquals(deadState, deadState1);
    }

    @Test
    public void shouldReturnTrueWhenStateValueIsSame() {
        DeadState deadState = new DeadState("-");
        DeadState deadState1 = new DeadState("-");

        assertEquals(deadState, deadState1);
    }

    @Test
    public void shouldBeComparedToItself() {
        DeadState deadState = new DeadState("-");

        assertEquals(deadState, deadState);
    }
}
