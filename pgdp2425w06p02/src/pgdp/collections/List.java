package pgdp.collections;

public class List {

    private int size;
    private Element head;
    private Element tail;

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        head = tail = null;

    }

    public void add(String value) {
        add(size, value);

    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }
        if (isEmpty()) {
            head = tail = new Element(value);
        } else if (index == 0) {
            head = new Element(value, head);
        } else if (index == size) {
            tail.next  = new Element(value);
            tail = tail.next;
        } else {
            Element current = head;
            // Falls index == 1 => direkt hinter head einfuegen => keine Iteration => index - 1 mal iterieren
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            // neues Element hinter current einfuegen
            current.next = new Element(value, current.next);
        }
        size++;
        return true;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Element current = head;
        // Falls index == 0 => head zurueckgeben => keine Iteration => index mal iterieren
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (size == 1) {
            clear();
        } else if (index == 0) {
            head = head.next;
        } else {
            Element current = head;
            // Falls index == 1 => das Element hinter head entfernen => keine Iteration => index - 1 mal iterieren
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            // Das Element hinter current entfernen.
            current.next = current.next.next;
            // Wenn das letzte Element entfernt wurde
            if (current.next == null) {
                tail = current;
            }
        }
        size--;
    }


    /*
     * returns String representation of the list, uncomment after doing your programing magic! 🐧
     */

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("[ ");
        Element current = head;
        for (int i = 0; i < size; i++) {
            out.append(current.toString());
            if (i != size - 1) {
                out.append(", ");
            }
            current = current.next;
        }
        out.append(" ]");
        return out.toString();
    }


    private static class Element {

        private String value;
        private Element next;

        public Element(String value) {
            this.value = value;
        }

        public Element(String value, Element next) {
            this.value = value;
            this.next = next;
        }
        @Override
        public String toString() {
            return value;
        }

    }
}
