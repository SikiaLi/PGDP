package pgdp.iter;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Tree<T extends Comparable<T>> implements Iterable<T> {
	private Element root;

	public void insert(T value) {
		Objects.requireNonNull(value);
		if (root == null) {
			root = new Element(value);
		} else {
			var node = root;
			while (true) {
				var cmp = value.compareTo(node.value);
				if (cmp == 0) {
					break;
				} else if (cmp < 0) {
					if (node.left == null) {
						node.left = new Element(value);
						break;
					} else {
						node = node.left;
					}
				} else {
					if (node.right == null) {
						node.right = new Element(value);
						break;
					} else {
						node = node.right;
					}
				}
			}
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO
		return new TreeIterator(root);
	}

	public class Element {
		private T value;
		private Element left;
		private Element right;

		public Element(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Element getLeft() {
			return left;
		}

		public void setLeft(Element left) {
			this.left = left;
		}

		public Element getRight() {
			return right;
		}

		public void setRight(Element right) {
			this.right = right;
		}
	}

	public class TreeIterator implements Iterator<T> {
		// TODO
		private Element element;
		private TreeIterator leftTree, rightTree = null;
		private boolean left, right, aktuell = false;
		public TreeIterator(Element e) {
			this.element = e;
			if (e != null) {
				leftTree = new TreeIterator(e.left);
				rightTree = new TreeIterator(e.right);
			}
		}

		@Override
		public boolean hasNext() {
			if (element == null) {
				return false;
			} else if (right && aktuell) {
				return false;
			} else if (aktuell && !rightTree.hasNext()) {
				right = true;
				return false;
			} else {
				return true;
			}
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			if (!left){
				if (leftTree.hasNext()) {
					return leftTree.next();
				} else {
					left = true;
				}
			}
			if (!aktuell){
				aktuell = true;
				return element.value;
			}
			return rightTree.next();
			/*if (!right) {
				if (rightTree.hasNext()) {
					return rightTree.next();
				} else {
					right = true;
				}
			}
			return null;*/

		}
	}
}