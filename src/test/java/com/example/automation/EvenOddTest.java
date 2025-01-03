package com.example.automation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EvenOddTest {

    @Test
    public void testCheckEvenOdd() {
        EvenOdd evenOdd = new EvenOdd();
        
        // Testing if a number is even
        assertEquals("4 is even.", evenOdd.checkEvenOdd(4));
        assertEquals("0 is even.", evenOdd.checkEvenOdd(0));

        // Testing if a number is odd
        assertEquals("7 is odd.", evenOdd.checkEvenOdd(7));
        assertEquals("-3 is odd.", evenOdd.checkEvenOdd(-3));
    }

    @Test
    public void testFindEvenNumbersInRange() {
        EvenOdd evenOdd = new EvenOdd();

        // Testing even numbers in a range
        String expected = "Even numbers between 1 and 10 are: 2 4 6 8 10 ";
        assertEquals(expected, evenOdd.findEvenNumbersInRange(1, 10));

        // Testing even numbers in a range with a different start and end
        expected = "Even numbers between 5 and 15 are: 6 8 10 12 14 ";
        assertEquals(expected, evenOdd.findEvenNumbersInRange(5, 15));
    }

    @Test
    public void testFindOddNumbersInRange() {
        EvenOdd evenOdd = new EvenOdd();

        // Testing odd numbers in a range
        String expected = "Odd numbers between 1 and 10 are: 1 3 5 7 9 ";
        assertEquals(expected, evenOdd.findOddNumbersInRange(1, 10));

        // Testing odd numbers in a range with a different start and end
        expected = "Odd numbers between 5 and 15 are: 5 7 9 11 13 15 ";
        assertEquals(expected, evenOdd.findOddNumbersInRange(5, 15));
    }

    @Test
    public void testNegativeNumbers() {
        EvenOdd evenOdd = new EvenOdd();

        // Testing negative even number
        assertEquals("-4 is even.", evenOdd.checkEvenOdd(-4));

        // Testing negative odd number
        assertEquals("-3 is odd.", evenOdd.checkEvenOdd(-3));
    }
}
