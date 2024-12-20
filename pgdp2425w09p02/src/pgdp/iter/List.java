package pgdp.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class List<T> implements Iterable<T> {

	private Element first;
	private Element last;

	void insert(T value) {
		if (first == null) {
			first = new Element(value);
			last = first;
		} else {
			var n = new Element(value);
			last.setNext(n);
			last = n;
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO
		return new ListIterator(first);
	}

	public class Element {
		private T value;
		private Element next;

		Element(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Element getNext() {
			return next;
		}

		public void setNext(Element next) {
			this.next = next;
		}
	}

	public class ListIterator implements Iterator<T> {
		// TODO
		private Element element;

		public ListIterator(Element e) {
			this.element = e;
		}

		@Override
		public boolean hasNext() {
			return element != null;
		}

		@Override
		public T next() {
			if (!hasNext()){
				throw new NoSuchElementException();
			}
			T value = element.getValue();
			element = element.next;
			return value;
		}
	}

	public static void main(String[] args) {

		List<Integer> list1 = new List<>();
		for (int i = 0; i < 5; i++) {
			list1.insert(i);
		}

		Iterator<Integer> iterator = list1.iterator();
		while (iterator.hasNext()) {
			Integer a = iterator.next();
			a+=1;
			System.out.println(a);
		}
	}

}