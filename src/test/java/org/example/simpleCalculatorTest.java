package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class simpleCalculatorTest {
    simpleCalculator calculator;

    @BeforeEach
    void setup(){
        calculator = new simpleCalculator();
    }
    @Test
    void test_addition(){
        assertEquals(22, calculator.addition(10, 12));
    }

    @Test
    void test_soustraction(){
        assertEquals(-2, calculator.soustraction(10, 12));
    }

    @Test
    void test_multiplication(){
        assertEquals(120, calculator.multiplication(10, 12));
    }

    @Test
    void test_isEven_working(){
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(5));
    }

}