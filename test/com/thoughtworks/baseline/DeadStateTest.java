package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeadStateTest {
    @Test
    public void shouldGenerateDeadState() {
        DeadState deadState = new DeadState("-");
        assertEquals(deadState, deadState.generateNewState(2));
    }
}
