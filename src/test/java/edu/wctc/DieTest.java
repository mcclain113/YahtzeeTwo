package edu.wctc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DieTest {
    private Die die;

    @BeforeEach
    public void setup() {
        die = new Die(6);
    }

    @Test
    public void canRoll(){
        die.rollDie();
    }
}
