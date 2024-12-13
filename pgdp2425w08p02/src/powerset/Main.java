package powerset;

import java.util.LinkedList;

public class Main {


    /**
     * @param inputSet from this set all power sets should be returned as a list.
     */

    static LinkedList<LinkedList<Integer>> powerSet(LinkedList<Integer> inputSet) {
        // TODO

        LinkedList<LinkedList<Integer>> subsets = new LinkedList<>();

        //base case: empty list is the only power set of an empty list
        if (inputSet.isEmpty()) {
            subsets.add(new LinkedList<>());
            return subsets;
        }

        //make a copy of the input
        LinkedList<Integer> inputSetCopy = new LinkedList<>(inputSet);


        //separate the head from the rest
        int element = inputSetCopy.get(0);
        inputSetCopy.remove(0);
        //recursive call to find subsets of the rest
        LinkedList<LinkedList<Integer>> subsetsFromRest = powerSet(inputSetCopy);

        //add all subsets from rec call to the main list
        for (LinkedList<Integer> subset : subsetsFromRest) {
            subsets.add(subset);
            LinkedList<Integer> withX = new LinkedList<>(subset);
            withX.add(element);
            //add the subset with the current element
            subsets.add(withX);
        }
        return subsets;
    }

    /**
     * @param inputSet all power sets from this set with sum
     * @param sum      should be returned as a list.
     */
    static LinkedList<Integer> findWithSum(LinkedList<Integer> inputSet, int sum) {
        // TODO
        //sum can not be negative
        if (sum < 0) {
            return null;
        }
        //if input empty, return the empty list
        if (inputSet.isEmpty()) {
            if (sum == 0) {
                return inputSet;
            }
            return null;
        }

        //make a copy of the input list and separate the first element
        LinkedList<Integer> rest = new LinkedList<>(inputSet);

        int head = rest.get(0);
        rest.remove(0);

        //try to include the head from the subset recursively
        LinkedList<Integer> withHead = findWithSum(rest, sum - head);

        if (withHead != null) {
            withHead.add(head); //add the head to the subset
            return withHead;
        }
        //exclude the head from the sum
        return findWithSum(rest, sum);
    }


    public static void main(String[] args) {
        // TODO : Test your implementation here.

        //generate an example list to test.
        LinkedList<Integer> inputSet = new LinkedList<>();
        inputSet.add(1);
        inputSet.add(2);
        inputSet.add(3);

        //find all power sets of the set and print them.
        System.out.println("Finding all power sets");
        LinkedList<LinkedList<Integer>> subsets = powerSet(inputSet);
        subsets.forEach(System.out::println);
        System.out.println();

        //find the subset from the set with sum and print them.
        int sum = 5;
        System.out.println("Finding subset with sum " + sum);
        LinkedList<Integer> subsetWithSum = findWithSum(inputSet, sum);
        System.out.println(subsetWithSum);
    }
}
