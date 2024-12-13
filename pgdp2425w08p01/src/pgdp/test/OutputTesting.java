package pgdp.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pgdp.recursion.NonRecursiveMethods;
import pgdp.recursion.PinguRecursion;
import pgdp.recursion.RecursiveMath;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputTesting {

    /**
     * Extend this class
     * to compare the functionality of your recursive methods
     * with the provided implementations.
     */

    // TODO: Test your recursive implementations from
    //  PinguRecursion with the non-recursive implementations from NonRecursiveMethods.

    //Example 1
    @Test
    @DisplayName("Test GCD | findGCD() vs. findGCDRec")
    void testGCD() {
        assertEquals(PinguRecursion.findGCDRec(100, 200), NonRecursiveMethods.findGCD(100, 200));
        assertEquals(PinguRecursion.findGCDRec(10, 20), NonRecursiveMethods.findGCD(10, 20));
        assertEquals(PinguRecursion.findGCDRec(0, 20), NonRecursiveMethods.findGCD(0, 20));
    }

    // TODO: Test your recursive implementations from
    //  RecursiveMath with the non-recursive implementations from RecursiveMath.
    //Example 1
    @Test
    @DisplayName("Test Fibonacci | fibonacciIterative() vs. fibonacciRecursive")
    void testFibonacci() {
        assertEquals(RecursiveMath.fibonacciIterative(3), RecursiveMath.fibonacciRecursive(3));
        assertEquals(RecursiveMath.fibonacciIterative(32), RecursiveMath.fibonacciEndRec(32));
    }
}


