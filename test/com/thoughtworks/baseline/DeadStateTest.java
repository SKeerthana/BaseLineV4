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
    public void shouldReturnFalseWhenComparedWithNull() {
        DeadState deadState = new DeadState("-");

        assertNotEquals(deadState, null);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithAnotherObjectOfDifferentType() {
        DeadState deadState = new DeadState("-");

        assertNotEquals(deadState, "SomeString");
    }
}
