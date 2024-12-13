package pgdp.datastructures.tree;

public class BSTNode<T extends Comparable<T>> extends BinaryNode<T> {

    // TODO 3.1: Implement the constructors.
    public BSTNode(T value, BSTNode<T> left, BSTNode<T> right) {
        super(value, left, right);
    }

    public BSTNode(T value) {
        super(value, null, null);
    }

    /**
     * Compares the given value to the tree's nodes and inserts it in the correct position.
     *
     * @param value The value to be inserted to the tree.
     */
    public void insert(T value) {
        // TODO 3.2: Implement recursively.
        if (getValue().equals(value)) {
            return;
        } else if (value.compareTo(getValue()) < 0) {
            if (getLeft() == null) {
                setLeft(new BSTNode<T>(value));
            } else {
                ((BSTNode<T>) getLeft()).insert(value);
            }
        } else {
            if (getRight() == null) {
                setRight(new BSTNode<T>(value));
            } else {
                ((BSTNode<T>) getRight()).insert(value);
            }
        }
    }


    /**
     * @param value The value to be checked for existence in the tree.
     * @return true if the value is found, false otherwise.
     */
    public boolean contains(T value) {
        // TODO 3.2: Implement recursively.
        if (getValue().equals(value)) {
            return true;
        } else if (value.compareTo(getValue()) < 0) {
            if (getLeft() == null) {
                return false;
            } else {
                return ((BSTNode<T>) getLeft()).contains(value);
            }
        } else {
            if (getRight() == null) {
                return false;
            } else {
                return ((BSTNode<T>) getRight()).contains(value);
            }
        }
    }

}
