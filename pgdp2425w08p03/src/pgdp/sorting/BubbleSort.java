package pgdp.sorting;

import java.util.List;

public class BubbleSort {

    /**
     * From W05P03. Use this method to test your recursive MS
     * implementations in OutputTesting.
     * Sorts Integers with BubbleSort iteratively.
     *
     * @param input the List of Integers to be sorted
     */

    public static List<Integer> bubbleSort(List<Integer> input) {
        int n = input.size();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (input.get(j) > input.get(j + 1)) {
                    int temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }
        return input;
    }


    /**
     * From W05P03. Use this method to test your recursive SS
     * implementations in OutputTesting.
     * Sorts Integers with BubbleSort iteratively.
     *
     * @param input the Array of Integers to be sorted
     */
    public static int[] bubbleSort(int[] input) {
        for (int i = input.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }

}
