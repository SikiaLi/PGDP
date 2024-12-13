package pgdp.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static pgdp.sorting.BubbleSort.*;
import static pgdp.sorting.MergeSort.*;
import static pgdp.sorting.SortingComparison.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pgdp.sorting.StoogeSort.stoogeSort;

public class OutputTesting {

    /**
     * Extend this class to compare the functionality of your recursive
     * sorting algorithms with the provided BubbleSort implementation.
     * You will find 2 examples below.
     */


    //Example: Comparing with the expected output.
    @Test
    @DisplayName("Test MergeSort with input")
    void testExampleList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 55, 6, 6, 0, 9, 3));
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 5, 6, 6, 9, 55));
        assertEquals(sortedList, mergeSort(list));
    }

    //Example: Comparing with the output from the bubbleSort method.
    @Test
    @DisplayName("Empty List BubbleSort vs. MergeSort")
    void testListSizeZero() {
        List<Integer> list = new ArrayList<>(0);
        assertEquals(bubbleSort(list), mergeSort(list));
    }

    //Example: Comparing with the output from the bubbleSort method.
    @Test
    @DisplayName("Empty Array BubbleSort vs. StoogeSort")
    void testEmptyArray() {
        int[] array = new int[0];
        int[] arrayBubbleSorted = bubbleSort(array);
        stoogeSort(array);
        assertEquals(array, arrayBubbleSorted);
    }


}
