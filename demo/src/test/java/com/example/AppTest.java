package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    /**
     * Test to verify that an IllegalArgumentException is thrown when the number is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_fact_raises_exception_for_null_number() {
        Integer number = null;
        Integer power = 1;
        App.power(number, power);
    }

    /**
     * Test to verify that any number raised to the power of 0 returns 1.
     */
    @Test
    public void power_0_and_number_0_returns_1() {
        assertEquals(1.0, App.power(0, 0), 0.0001);
    }

    /**
     * Test to verify that any number raised to the power of 0 returns 1.
     */
    @Test
    public void power_0_and_any_number_returns_1() {
        assertEquals(1.0, App.power(1, 0), 0.0001);
    }

    /**
     * Test to verify that 2 raised to the power of 2 returns 4.
     */
    @Test
    public void power_2_and_number_2_returns_4() {
        assertEquals(4.0, App.power(2, 2), 0.0001);
    }
}
