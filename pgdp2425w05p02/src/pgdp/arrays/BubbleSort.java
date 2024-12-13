package pgdp.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length -1; i++) {
            boolean swapped = false;
            for (int j = 0; j < a.length-i-1; j++) {

                        // Swap arr[j] and arr[j+1], if arr[j] > arr[j+1]
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] bubble_sort = new int[]{6,1,6,8,9,1,9,1,5};
        bubbleSort(bubble_sort);
        System.out.println(Arrays.toString(bubble_sort));
    }

}
