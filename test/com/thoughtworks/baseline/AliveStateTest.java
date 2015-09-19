package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AliveStateTest {
    @Test
    public void shouldGenerateAliveState() {
        AliveState aliveState = new AliveState("X");
        assertEquals(aliveState, aliveState.generateNewState(2));
    }
}
