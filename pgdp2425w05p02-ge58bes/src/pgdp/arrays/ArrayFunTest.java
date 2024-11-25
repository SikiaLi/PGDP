package pgdp.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pgdp.PinguLib;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayFunTest {

    private static final int[] BASIC_INPUT = {1, 2, 3, 4, 5};

    @BeforeEach
    void setup() {
        PinguLib.setup();
    }

    @AfterEach
    void reset() {
        PinguLib.reset();
    }

    @Test
    void testPrint() {
        String expected = "{1, 2, 3, 4, 5}";
        ArrayFun.print(BASIC_INPUT);
        assertEquals(expected, PinguLib.getConsoleOutput());
    }

    @Test
    void testMinAndMax() {
        String expected = "Minimum = 1, Maximum = 5";
        ArrayFun.minAndMax(BASIC_INPUT);
        assertEquals(expected, PinguLib.getConsoleOutput());
    }

    @Test
    void testInvert() {
        String expected = "[5, 4, 3, 2, 1]";
        ArrayFun.invert(BASIC_INPUT);
        assertEquals(expected, PinguLib.getConsoleOutput());
    }

    @Test
    void testIntersect() {
        String exp1 = "[1, 2, 3, 4]";
        int[] arr1 = ArrayFun.intersect(BASIC_INPUT, 4);
        assertEquals(exp1, Arrays.toString(arr1));

        String exp2 = "[1, 2, 3, 4, 5, 0, 0]";
        int[] arr2 = ArrayFun.intersect(BASIC_INPUT, 7);
        assertEquals(exp2, Arrays.toString(arr2));
    }

    @Test
    void testLinearize() {
        String exp = "[1, 3, 25, 7, 4, 6, 9]";
        int[][] arr = new int[][] {{1, 3}, {25}, {7, 4, 6, 9}};
        int[] liefert = ArrayFun.linearize(arr);
        assertEquals(exp, Arrays.toString(liefert));
    }
}