package pgdp.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static pgdp.sorting.BubbleSort.bubbleSort;
import static pgdp.sorting.MergeSort.mergeSort;
import static pgdp.sorting.StoogeSort.stoogeSort;

public class SortingComparison {
    //TODO: Run the main method to see the difference in the efficiency of iterative & recursive sorting algorithms,
    // especially in larger examples. Uncomment merge or bubble sort after implementing them.
    public static void main(String[] args) {
        System.out.println("Comparing BubbleSort & MergeSort");
        compareBubbleVsMerge();

        System.out.println("Comparing BubbleSort & StoogeSort");
        compareBubbleVsStooge();
    }

    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(10_000)); // Random numbers between 0 and 99,999
        }
        return list;
    }

    public static int[] generateArrayFromList(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void compareBubbleVsMerge() {
        List<Integer> largeList = generateRandomList(10_000); // 10_000 elements
        List<Integer> smallerList = generateRandomList(10);   // 10 elements


        System.out.println("Testing with the small list (10 elements):");
        System.out.println("Unsorted Original List: " + smallerList);
        System.out.println("Bubble Sort : " + bubbleSort(new ArrayList<>(smallerList)));

        System.out.println("Merge Sort : " + mergeSort(new ArrayList<>(smallerList)));
        System.out.println();



        System.out.println("Testing with the large list (20,000 elements):");

        long startMergeSort = System.currentTimeMillis();
        mergeSort(new ArrayList<>(largeList));
        long mergeSortTime = System.currentTimeMillis() - startMergeSort;

        try {
            long startBubbleSort = System.currentTimeMillis();
            bubbleSort(new ArrayList<>(largeList));
            long bubbleSortTime = System.currentTimeMillis() - startBubbleSort;
            System.out.println("Bubble Sort Time: " + bubbleSortTime + " ms");
        } catch (StackOverflowError | OutOfMemoryError e) {
            System.out.println("Bubble Sort failed!");
        }

        System.out.println("Merge Sort Time: " + mergeSortTime + " ms");
        System.out.println();


    }

    public static void compareBubbleVsStooge() {

        List<Integer> largeList = generateRandomList(1_000); // 1_000 elements
        List<Integer> smallerList = generateRandomList(10);   // 10 elements

        System.out.println("Testing with the small list (10 elements):");
        System.out.println("Unsorted Original List: " + smallerList);
        System.out.println("Bubble Sort : " + bubbleSort(new ArrayList<>(smallerList)));

        int[] smallerArray = generateArrayFromList(smallerList);
        stoogeSort(smallerArray);
        System.out.println("Stooge Sort : " + Arrays.toString(smallerArray));
        System.out.println();


        System.out.println("Testing with the large list (1,000 elements):");

        long startStoogeSort = System.currentTimeMillis();
        int[] largerArray = generateArrayFromList(largeList);
        stoogeSort(largerArray);
        long stoogeSortTime = System.currentTimeMillis() - startStoogeSort;

        try {
            long startBubbleSort = System.currentTimeMillis();
            bubbleSort(new ArrayList<>(largeList));
            long bubbleSortTime = System.currentTimeMillis() - startBubbleSort;
            System.out.println("Bubble Sort Time: " + bubbleSortTime + " ms");
        } catch (StackOverflowError | OutOfMemoryError e) {
            System.out.println("Bubble Sort failed!");
        }

        System.out.println("Stooge Sort Time: " + stoogeSortTime + " ms");

    }

}
