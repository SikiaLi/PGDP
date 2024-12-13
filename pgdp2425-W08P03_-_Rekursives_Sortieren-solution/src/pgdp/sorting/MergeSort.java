package pgdp.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static List<Integer> mergeSort(List<Integer> list) {

        if (list.size() <= 1) {
            return list;
        }
        boolean sorted = true;
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) < list.get(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            return list;
        }

        List<Integer> list1 = list.subList(0, (list.size()+1) / 2);
        List<Integer> list2 = list.subList((list.size()+1) / 2, list.size());

        list1 = mergeSort(list1);
        list2 = mergeSort(list2);

        List<Integer> result = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;
        while (list.size() != result.size()) {

            if (index1 >= list1.size()) {
                result.addAll(list2.subList(index2, list2.size()));
                return result;
            } else if (index2 >= list2.size()) {
                result.addAll(list1.subList(index1, list1.size()));
                return result;
            }

            if (list1.get(index1) < list2.get(index2)) {
                result.add(list1.get(index1++));
            } else {
                result.add(list2.get(index2++));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //TODO: Uncomment after implementing the mergeSort method to see the outputs .
        //List<Integer> unsortedList = Arrays.asList(5, 3, 8, 6, 2, 7, 4, 1);
        List<Integer> unsortedList = Arrays.asList(3, 6, 2, 8, 4);
        List<Integer> alreadySortedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> singleElementList = Arrays.asList(42);
        List<Integer> emptyList = new ArrayList<>();

        System.out.println("Original: " + unsortedList);
        System.out.println("Sorted:   " + MergeSort.mergeSort(unsortedList));

        System.out.println("\nOriginal: " + alreadySortedList);
        System.out.println("Sorted:   " + MergeSort.mergeSort(alreadySortedList));

        System.out.println("\nOriginal: " + singleElementList);
        System.out.println("Sorted:   " + MergeSort.mergeSort(singleElementList));

        System.out.println("\nOriginal: " + emptyList);
        System.out.println("Sorted:   " + MergeSort.mergeSort(emptyList));
    }
}
