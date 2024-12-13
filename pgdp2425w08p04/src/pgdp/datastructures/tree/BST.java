package pgdp.datastructures.tree;

import java.util.LinkedList;
import java.util.List;

public class BST<T extends Comparable<T>> {

    // TODO 4.1: Add the attributes and constructors.
    private BSTNode<T> root;

    public BST() {
        root = null;
    }


    /**
     * Checks if the binary search tree is empty.
     *
     * @return true if the tree is empty, false otherwise.
     */
    public boolean isEmpty() {
        // TODO 4.2: Implement the method.
        if (root == null) {
            return true;
        }
        return false;
    }

    /**
     * Returns the total number of nodes in the binary search tree.
     *
     * @return the size of the tree.
     */
    public int size() {
        // TODO 4.3: Implement the method.
        if (root == null) {
            return 0;
        }
        return root.size();
    }


    /**
     * Checks if the given value is present in the tree.
     *
     * @param value The value to search for in the tree.
     * @return true if the value is found, false otherwise.
     */
    public boolean contains(T value) {
        // TODO 4.4: Implement the method.
        if (isEmpty()) {
            return false;
        }
        return root.contains(value);
    }

    /**
     * Inserts the given value into the binary search tree, following the BST property.
     *
     * @param value The value to insert into the tree.
     */
    public void insert(T value) {
        // TODO 4.5: Implement the method.
        if (value == null) {
            return;
        }
        if (isEmpty()) {
            root = new BSTNode<T>(value);
        } else {
            root.insert(value);
        }
    }

    /**
     * Returns a list of all the values in the tree in sorted (in-order) order.
     *
     * @return a list of tree values in sorted order.
     */
    public List<T> toList() {
        // TODO 4.6: Implement the method.
        if (isEmpty()) {
            return new LinkedList<>();
        }
        return root.toList(Order.IN);
    }


    /**
     * Returns a string representation of the tree, in-order.
     *
     * @return a string representing the tree.
     */
    @Override
    public String toString() {
        // TODO 4.7: Implement the method.
        if (isEmpty()) {
            return "[]";
        } else {
            return root.toString();
        }
    }
}
