package pgdp.datastructures.tree;

import java.util.List;

public abstract class Node<T> {

    private T value;
    private Node<T>[] children;

    @SafeVarargs
    public Node(T value, Node<T>... nodes) {
        this.value = value;
        children = nodes;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    public Node<T>[] getChildren() {
        return children;
    }

    public Node<T> getChild(int i) {
        // TODO 1.1: Returns i-th child or null.
        if (i < 0 || children.length <= i) {
            return null;
        }
        return children[i];
    }

    public void setChild(int i, Node<T> c) {
        // TODO 1.2: Sets to c-th node i-th child, if i is valid.
        if (i < 0 || children.length <= i) {
            return;
        }
        children[i] = c;
    }

    public boolean isLeaf() {
        // TODO 1.3: Returns true if the node is a leaf.
        for (Node<T> node : children) {
            if (node != null) {
                return false;
            }
        }
        return true;
    }

    public int height() {
        // TODO 1.4: Returns the height starting from the current node. Should be recursive!
        int height = 0;
        for (Node<T> node : children) {
            if (node != null) {
                int nodeHeight = node.height();
                height = height < nodeHeight ? nodeHeight : height;
            }
        }
        return height + 1;
    }

    public int size() {
        // TODO 1.5: Returns the number of nodes in the current tree. Should be recursive!
        int size = 0;
        for (Node<T> node : children) {
            if (node != null) {
                size += node.size();
            }
        }
        return size + 1;
    }

    public abstract List<T> toList(Order order);
}
