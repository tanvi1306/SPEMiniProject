package com.example.scientificcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScientificCalculatorApplicationTests {

    //sqr root
    @Test
    public void testSquareRootForZero() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(0.0, calculator.squareRoot(0), 0.001);
    }

    @Test
    public void testSquareRootForNegativeNumber() {
        ScientificCalculator calculator = new ScientificCalculator();
        // Assuming that squareRoot function returns NaN for negative numbers
        assertTrue(Double.isNaN(calculator.squareRoot(-4)));
    }

    //factorial
    @Test
    public void testFactorialForZero() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorialForNegativeNumber() {
        ScientificCalculator calculator = new ScientificCalculator();
        // Assuming that factorial function throws an IllegalArgumentException for negative numbers
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-4));
    }

    @Test
    public void testLogarithmForZero() {
        ScientificCalculator calculator = new ScientificCalculator();
        // Assuming that logarithm function returns negative infinity for zero
        assertEquals(Double.NEGATIVE_INFINITY, calculator.logarithm(0), 0.001);
    }

    @Test
    public void testLogarithmForNegativeNumber() {
        ScientificCalculator calculator = new ScientificCalculator();
        // Assuming that logarithm function throws an IllegalArgumentException for negative numbers
        assertThrows(IllegalArgumentException.class, () -> calculator.logarithm(-4));
    }

    @Test
    public void testExpoForZeroBase() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(0.0, calculator.expo(0, 2), 0.001);
    }

    @Test
    public void testExpoForZeroExponent() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(1.0, calculator.expo(4, 0), 0.001);
    }

}
