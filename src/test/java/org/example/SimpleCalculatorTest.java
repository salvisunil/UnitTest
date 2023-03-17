package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
//      assertEquals(4, calculator.add(2, 2));
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    void ThreePlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));

    }
    @Test
    void TwoPlusTwoShouldEqualzero() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.add(2, 2));

    }
}